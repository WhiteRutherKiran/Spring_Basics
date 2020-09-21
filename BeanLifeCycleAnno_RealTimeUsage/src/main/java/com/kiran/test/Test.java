package com.kiran.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kiran.beans.Voter;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		Voter v = null;
		ctx = new ClassPathXmlApplicationContext("com/kiran/cfgs/applicationcontext.xml");
		v = ctx.getBean(Voter.class);
		System.out.println(v.voterCheck());
		((AbstractApplicationContext) ctx).close();
	}
}
