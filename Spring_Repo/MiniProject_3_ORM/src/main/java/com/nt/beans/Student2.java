package com.nt.beans;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Student2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int sid;
	private String name;
	private String course;
	private double fee;
}
