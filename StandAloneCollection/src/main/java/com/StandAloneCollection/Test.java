package com.StandAloneCollection;
import java.util.*;
public class Test 
{
	private List<String> studentNames;
	private Map<String,Integer> fees;
	private Properties props1;


	public Properties getProps1() {
		return props1;
	}


	public void setProps1(Properties props1) {
		this.props1 = props1;
	}


	public List<String> getStudentNames() {
		return studentNames;
	}


	public void setStudentNames(List<String> studentNames) {
		this.studentNames = studentNames;
	}


	@Override
	public String toString() {
		return "Test [studentNames=" + studentNames + ", fees=" + fees + "]"+ ", properties=" + props1 + "]";
	}


	public Map<String, Integer> getFees() {
		return fees;
	}


	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}


	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

}
