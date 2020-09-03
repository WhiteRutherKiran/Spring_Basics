package com.nt.beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Student1 {
private Set<String> colors;//string type
private Set<Integer> rank;//primitive type
private Set<Employee> emp;//object type
public Student1(Set<Employee> emp) {
	this.emp=emp;
}
public void setColors(Set<String> colors) {
	this.colors = colors;
}
public void setRank(Set<Integer> rank) {
	this.rank= rank;
}
@Override
public String toString() {
	return "Student1 [colors=" + colors + ", rank=" + rank + ", emp=" + emp + "]";
}

}
