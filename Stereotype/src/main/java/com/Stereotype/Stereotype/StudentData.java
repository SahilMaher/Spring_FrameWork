package com.Stereotype.Stereotype;
import java.util.*;
import org.springframework.stereotype.Component; 
import org.springframework.beans.factory.annotation.Value;

@Component("studentdata")
public class StudentData
{
	@Value("Bhagat")
	private String name;
	@Value("21")
	private int age;
	@Value("#{numbers}")
	private List<String> mobile;
	
	public List<String> getMobile() {
		return mobile;
	}
	public void setMobile(List<String> mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "StudentData [name=" + name + ", age=" + age + "]"+ ", MobileNumber=" + mobile + "]";
	}
	public StudentData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
