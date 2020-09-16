package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Student1;

public class Properties_Injection_Test {
	public static void main(String[] args) {
		//load container
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		Student1 st= ctx.getBean("com.nt.beans.Student1",Student1.class);
	//	Student1 st1= ctx.getBean("std",Student1.class);
		System.out.println(st);
		System.out.println(st.hashCode());
		System.out.println("===============================");
		// st= ctx.getBean("com.nt.beans.Student1#2",Student1.class);
		//System.out.println(st);
		//System.out.println("===============================");
		 st= ctx.getBean("com.nt.beans.Student1#0",Student1.class);
		System.out.println(st);		System.out.println(st.hashCode());

		System.out.println("===============================");
		 st= ctx.getBean("com.nt.beans.Student1#1",Student1.class);
		System.out.println(st);		System.out.println(st.hashCode());


	}
}
