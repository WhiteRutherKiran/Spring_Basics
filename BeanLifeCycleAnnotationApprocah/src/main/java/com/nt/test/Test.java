package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.entity.EntityClass;

public class Test {
 
	public static void main(String[] args) {
	EntityClass e = new EntityClass();
//	Department d = new Department();
	ApplicationContext ctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	e=ctx.getBean(EntityClass.class,"entity");
	System.out.println(e);
	System.out.println("======================");
	//d=ctx.getBean(Department.class,"dept");
	//System.out.println(d);
	((AbstractApplicationContext) ctx).close();

	}

}
