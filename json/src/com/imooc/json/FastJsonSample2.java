package com.imooc.json;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class FastJsonSample2 {
	public static void main(String[] args) {
		List emplist = new ArrayList();
		for (int i = 1 ; i <= 100 ; i++) {
			Employee employee = new Employee();
			employee.setEmpno(4488 + i);
			employee.setEname("员工" + i);
			emplist.add(employee);
		}
		//可以对集合、数组进行序列化，返回的是一个数组，数组里存放的是字符串
		String jsonToStr = JSON.toJSONString(emplist);
		System.out.println(jsonToStr);
		//解析数组
		List<Employee> emps = JSON.parseArray(jsonToStr , Employee.class);
		for(Employee e : emps) {
			System.out.println(e.getEmpno() + ":" + e.getEname());
		}
	}
}
