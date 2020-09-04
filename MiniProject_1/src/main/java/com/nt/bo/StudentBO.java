package com.nt.bo;

import lombok.Data;

@Data
public class StudentBO {
	private int sid;
	private String name, course;
	private double fee;
}
