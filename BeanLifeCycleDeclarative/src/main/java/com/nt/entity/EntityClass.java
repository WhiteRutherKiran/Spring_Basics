package com.nt.entity;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class EntityClass {
private int cno;
private String cname;
private Department dept;
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	System.out.println("setter injerction");
	this.dept = dept;
}





	
	  //Declarative approch 
public void inti() { if(cno<=100) {
	  System.out.println("you are in method"); } }
	  
	  public void des() { System.out.println("object destroyed"); }
	 
	 
}
