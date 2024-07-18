package com.springdemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("sukesh")
public class Manager implements Employee {
	
	@Autowired
	@Qualifier("axis")
	Client c;
	

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Manager(Client c) {
		super();
		this.c = c;
	}


	public void work() {
		// TODO Auto-generated method stub
		
		c.project();
	}

}
