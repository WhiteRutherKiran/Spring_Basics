package com.nt.beans;

public class ClassF {
//private ClassB classb;
private ClassC classc;
private Ravi ravi;


public void setClassC(ClassC classc) {
	this.classc=classc;
	///System.out.println("ClassF setter below classc methods");
	classc.here();
	classc.hello();
}

public void setRavi(Ravi ravi) {
	//System.out.println("classf setter ravi below ravi methods called");
	this.ravi=ravi;
	ravi.methods();
}

}
