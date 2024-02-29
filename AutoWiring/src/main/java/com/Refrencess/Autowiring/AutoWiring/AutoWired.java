package com.Refrencess.Autowiring.AutoWiring;

public class AutoWired
{
	Address add;
	Emp emp;

	public AutoWired(Address add, Emp emp) {
		super();
		this.add = add;
		this.emp = emp;
	}

	public Emp getEmp() {
		return emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public AutoWired(Address add) {
		super();
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public AutoWired() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AutoWired [add=" + add + "]"+"Emp"+emp;
	}

}
