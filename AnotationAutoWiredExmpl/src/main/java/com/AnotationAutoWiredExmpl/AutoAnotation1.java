package com.AnotationAutoWiredExmpl;

import org.springframework.beans.factory.annotation.*;

public class AutoAnotation1 {
	
	@Autowired
	Address add;
	

	public AutoAnotation1(Address add) {
		super();
		this.add = add;
	
	}





	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public AutoAnotation1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AutoWired [add=" + add + "]";
	}

}
