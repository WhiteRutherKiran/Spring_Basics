package com.kiran.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Voter {
	@Value("45")
	int age;
	@Value("suresh")
	String name;
	
	
	
	@PostConstruct
	public void valid() {
		boolean flag=false;
		System.out.println("init method called");
	if(age>=100) {
		flag=true;
		System.out.println("please enter your age below 100 years");
	}
	else if(age<=0) {
		flag=true;
		System.out.println("negatives not allowed here");
	}
	if(name==null) {
		flag=true;
		System.out.println("please enter name");
	}
	if (flag) {
		throw new IllegalArgumentException(" invalid inputs");
	}}
	
	public String voterCheck() {
		if(age>=18) {
			return "Mr "+name+" Your eligible for voting";
		}else {
			return "Mr "+name+" Your not eligible for voting";
		}
		
	}
	@Override
	public String toString() {
		return "Voter [age=" + age + ", name=" + name + "]";
	}
	@PreDestroy
	public void des() {
		 age= 0;
		 name=null;
		System.out.println("Object destroyed");
	}
}
