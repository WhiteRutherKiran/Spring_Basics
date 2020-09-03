package com.nt.beans;

public class Department {
private int cardno;
private String deptname;
private String position;
public void setCardno(int cardno) {
	this.cardno = cardno;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public void setPosition(String position) {
	this.position = position;
}
@Override
public String toString() {
	return "Department [cardno=" + cardno + ", deptname=" + deptname + ", position=" + position + "]";
}

}
