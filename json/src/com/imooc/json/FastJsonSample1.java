package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(88);
		employee.setEname("王晓东");
		employee.setJob("客户经理");
		employee.setSalary(10000f);
		employee.setDname("市场部");
		//设置日期
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 30, 0, 0, 0);
		employee.setHdate(c.getTime());
		//FastJSON中提供了JSON对象，完成对象与JSON字符串的互相转换
		//JSON.toJSONString(employee)返回一个数组，存放的是字符串
		String jsonToStr = JSON.toJSONString(employee);
		System.out.println(jsonToStr);
		
		//反序列化
		//JSON.parseObject(jsonToStr, Employee.class)返回一个java对象
		Employee emp = JSON.parseObject(jsonToStr, Employee.class);
		System.out.println(emp.getEname());
	}
}
