package com.nt.beans;

import java.util.Arrays;
import java.util.List;

public class Employee {
	private int hno;
	private String name;
	private String addr;
	private int postal;
	public void setHno(int hno) {
		this.hno = hno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setPostal(int postal) {
		this.postal = postal;
	}
	@Override
	public String toString() {
		return "Employee [hno=" + hno + ", name=" + name + ", addr=" + addr + ", postal=" + postal + "]";
	}
	
}
