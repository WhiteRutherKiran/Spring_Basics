package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class Student1 {
private List<String> colors;//string type
private List<Integer> rank;//primitive type
private List<Employee> emp;//object type
public Student1(List<Employee> emp) {
	this.emp=emp;
}
public void setColors(List<String> colors) {
	this.colors = colors;
}
public void setRank(List<Integer> rank) {
	this.rank= rank;
}
@Override
public String toString() {
	return "Student1 [colors=" + colors + ", rank=" + rank + ", emp=" + emp + "]";
}
}
