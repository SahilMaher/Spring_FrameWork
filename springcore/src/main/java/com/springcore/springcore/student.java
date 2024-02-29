package com.springcore.springcore;

public class student 
{
	private String name;
	private int id;
	private String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student Name Is:-" + name + "\nStudent Id Is :-" + id + "\nAddress is:-" + address+"." ;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public student(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	

}
