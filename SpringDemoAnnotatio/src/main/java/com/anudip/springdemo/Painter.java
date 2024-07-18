package com.anudip.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// there are 2 ways
// 1. constructor
// 2. setter
@Component("Tushar")
public class Painter implements Performer
{
	@Autowired
	// inject 
	@Qualifier("tri")
	Shape shape; // reference 
	
	
	public Painter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Painter(Shape shape) {
		super();
		this.shape = shape; // instance variable
	}


	@Override
	public void perform()
	{
		shape.draw();
	}


	
}
