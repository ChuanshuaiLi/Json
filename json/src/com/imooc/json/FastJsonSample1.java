package com.imooc.json;

import java.util.Calendar;

import com.alibaba.fastjson.JSON;

public class FastJsonSample1 {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpno(88);
		employee.setEname("������");
		employee.setJob("�ͻ�����");
		employee.setSalary(10000f);
		employee.setDname("�г���");
		//��������
		Calendar c = Calendar.getInstance();
		c.set(2019, 0, 30, 0, 0, 0);
		employee.setHdate(c.getTime());
		//FastJSON���ṩ��JSON������ɶ�����JSON�ַ����Ļ���ת��
		//JSON.toJSONString(employee)����һ�����飬��ŵ����ַ���
		String jsonToStr = JSON.toJSONString(employee);
		System.out.println(jsonToStr);
		
		//�����л�
		//JSON.parseObject(jsonToStr, Employee.class)����һ��java����
		Employee emp = JSON.parseObject(jsonToStr, Employee.class);
		System.out.println(emp.getEname());
	}
}
