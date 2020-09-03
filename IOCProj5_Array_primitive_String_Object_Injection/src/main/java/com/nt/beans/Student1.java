package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class Student1 {
private String[] colors;//string type
private int[] rank;//primitive type
private Employee[] emp;//object type
public Student1(Employee[] emp) {
	this.emp=emp;
}
public void setColors(String[] colors) {
	this.colors = colors;
}
public void setRank(int[] rank) {
	this.rank= rank;
}
@Override
public String toString() {
	return "Student1 [colors=" + Arrays.toString(colors) + ", rank=" + Arrays.toString(rank) + ", emp="
			+ Arrays.toString(emp) + "]";
}
}
