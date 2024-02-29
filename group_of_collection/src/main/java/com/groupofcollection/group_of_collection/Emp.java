package com.groupofcollection.group_of_collection;
import java.util.*;
public class Emp
{
	private String name;
	private List<String> phone;
	private Set<String> Address;
	private Map<String,String> cours;
	private Properties p;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddress() {
		return Address;
	}
	public void setAddress(Set<String> address) {
		Address = address;
	}
	public Map<String, String> getCours() {
		return cours;
	}
	public void setCours(Map<String, String> cours) {
		this.cours = cours;
	}
	public Emp(String name, List<String> phone, Set<String> address, Map<String, String> cours) {
		super();
		this.name = name;
		this.phone = phone;
		Address = address;
		this.cours = cours;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

}
