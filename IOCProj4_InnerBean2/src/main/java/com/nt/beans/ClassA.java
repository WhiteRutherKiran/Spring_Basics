package com.nt.beans;

public class ClassA {
private ClassB classb;
private ClassC classc;
private Ravi ravi;


public ClassA(ClassB classb) {
	//System.out.println("ClassA constructor");
	this.classb=classb;//call classb constructor
	classb.hello();//classb method call
}
public void setClassC(ClassC classc) {
	this.classc=classc;
	classc.here();
	classc.hello();
}

public void setRavi(Ravi ravi) {
	this.ravi=ravi;
	ravi.methods();
}

}
