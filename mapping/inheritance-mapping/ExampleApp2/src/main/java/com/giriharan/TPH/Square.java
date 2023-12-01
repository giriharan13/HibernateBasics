package com.giriharan.TPH;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="square")
public class Square extends Shape {
	
	@Column(name="side")
	private int side;
	
	public Square(int side) {
		super(side*side);
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}
	
}
