package com.springdemo;

// there are two ways to inject the object
//1.constructor way
//2.setter way
public class Painter {
 
	Shape shape;
	
	public Painter(Shape shape) {
		super();
		this.shape = shape;
	}

	void perform() {
		shape.draw();
	}
	
}
