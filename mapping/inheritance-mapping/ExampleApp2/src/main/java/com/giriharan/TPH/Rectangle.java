package com.giriharan.TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "rectangle")
public class Rectangle extends Shape{
	
	@Column(name="length")
	private int length;
	
	@Column(name="breadth")
	private int breadth;

	public Rectangle(int length, int breadth) {
		super(length*breadth);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
}
