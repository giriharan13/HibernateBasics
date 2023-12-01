package com.giriharan.TPSC;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
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
