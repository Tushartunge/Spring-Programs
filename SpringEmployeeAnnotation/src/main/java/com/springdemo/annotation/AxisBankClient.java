package com.springdemo.annotation;

import org.springframework.stereotype.Component;

@Component("axis")
public class AxisBankClient implements Client {

	String empType;
	
	public void project() {
		// TODO Auto-generated method stub
		System.out.println("employee is working for Axis bank project");
	}
	
	

}
