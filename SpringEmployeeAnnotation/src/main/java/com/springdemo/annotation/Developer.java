package com.springdemo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Tushar")
public class Developer implements Employee{
	
	@Autowired
	@Qualifier("sukesh")
	Employee e;

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Developing The System...");
		
	}

}
