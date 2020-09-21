package com.nt.entity;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Component
public class EntityClass {
	@Value("10")
private int cno;
	@Value("Raja")
private String cname;
	@Value("cj")

public int getCno() {
	return cno;
}
public void setCno(int cno) {
	System.out.println("entity");
	this.cno = cno;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}



	 @Override
public String toString() {
	return "EntityClass [cno=" + cno + ", cname=" + cname + "]";
}
	@PostConstruct
public void inti() { 
		 if(cno<=100) {
	  System.out.println("entity init"); 
	  } }
	 
	  @PreDestroy
	  public void des() { 
		  System.out.println("entity destroyed"); 
		  }
}
