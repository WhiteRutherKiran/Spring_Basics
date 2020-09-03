package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student1;

public class Map_Injection_Test {
	public static void main(String[] args) {
		//load container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Student1 st= ctx.getBean(Student1.class);
	//	Student1 st1= ctx.getBean("std",Student1.class);
		System.out.println(st);
	}
}
