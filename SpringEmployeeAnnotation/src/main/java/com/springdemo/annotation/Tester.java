package com.springdemo.annotation;

import org.springframework.stereotype.Component;

@Component("Tushar2")
public class Tester implements Employee {
	
	

	public Tester() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void work() {
		// TODO Auto-generated method stub
		System.out.println("Testing The System");
	}

}
