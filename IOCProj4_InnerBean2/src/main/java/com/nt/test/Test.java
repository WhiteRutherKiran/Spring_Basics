package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.ClassA;
import com.nt.beans.ClassF;


public class Test {

	public static void main(String[] args) {
		ApplicationContext parentctx = new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	ClassA cla=null;
	ClassF clf =null;
	cla= parentctx.getBean("cla",ClassA.class);
	System.out.println("=================================");
	clf= parentctx.getBean("clf",ClassF.class);
		
		}

	}


