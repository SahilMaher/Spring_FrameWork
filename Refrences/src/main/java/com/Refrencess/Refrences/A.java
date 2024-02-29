package com.Refrencess.Refrences;

public class A 
{
	
	B ob;
	Student std;
	Emp emp;

	public Student getStd() {
		return std;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public void setStd(Student std) {
		this.std = std;
	}

	public B getOb() {
		return ob;
	}

	public void setOb(B ob) {
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "A [ob=" + ob + "]"+" \n Student"+std+"\n Employee Data "+emp;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

}
