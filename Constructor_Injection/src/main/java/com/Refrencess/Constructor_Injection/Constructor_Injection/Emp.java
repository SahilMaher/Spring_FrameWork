package com.Refrencess.Constructor_Injection.Constructor_Injection;

import java.util.List;

public class Emp 
{
	private String name;
	private int id;
	private List<String> num;
	Certi c;
	public Emp(String name,int id,Certi c ,List<String> num)
	{
		this.id=id;
		this.num=num;
		this.name=name;
		this.c=c;
	}
	@Override
	public String toString() {
		return "Emp [name=" + this.name + ", id=" + this.id + ", c=" + this.c.cname+"Number List is"+this.num;
	}


}
