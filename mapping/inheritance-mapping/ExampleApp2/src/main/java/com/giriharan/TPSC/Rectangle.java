package com.giriharan.TPSC;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
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
