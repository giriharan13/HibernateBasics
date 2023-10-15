package com.giriharan.ExampleApp;

import java.util.Currency;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="item_id")
	private Long id;
	
	@Column(name="date_of_purchase")
	private Date dateOfPurchase;
	
	@Column(name="item_name")
	private byte[] nameInBytes;
	
	@Column(name="currency")
	private Currency currency;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public byte[] getNameInBytes() {
		return nameInBytes;
	}
	public void setNameInBytes(byte[] nameInBytes) {
		this.nameInBytes = nameInBytes;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
