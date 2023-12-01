package com.giriharan.TPCC;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({@AttributeOverride(name="id",column = @Column(name="square_id")),@AttributeOverride(name="area",column = @Column(name="square_area"))})
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
