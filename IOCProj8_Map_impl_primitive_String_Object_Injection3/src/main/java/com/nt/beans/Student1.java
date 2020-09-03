package com.nt.beans;
import java.util.Map;

public class Student1 {
private Map<String,String> colors;//string type
private Map<Integer,String> rank;//primitive type
private Map<Employee,Department> deatails;//object type
public Student1(Map<Employee,Department> deatails) {
	this.deatails=deatails;
}
public void setColors(Map<String,String> colors) {
	this.colors = colors;
}
public void setRank(Map<Integer,String> rank) {
	this.rank= rank;
}
@Override
public String toString() {
	return "Student1 [colors=" + colors + ", rank=" + rank + ", deatails=" + deatails + "]";
}


}
