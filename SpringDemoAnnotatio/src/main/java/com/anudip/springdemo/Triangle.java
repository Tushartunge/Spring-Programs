package com.anudip.springdemo;

import org.springframework.stereotype.Component;

//annotation that allows Spring to detect our custom beans automatically
@Component("tri")
public class Triangle implements Shape
{

	String color ="green";
	
	
	public Triangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triangle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() 
	{
		System.out.println("Painter is Drawing "  + color +" color Traingle");
		
	}	
	

}
