package com.javasolutions.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Emi {
	
	
	@Id
	@GeneratedValue
	Integer emi_id;
	
	@Column
	String date;
	
	@Column
	Integer amount;
	
	@ManyToOne
	Registration registration;

	public Integer getEmi_id() {
		return emi_id;
	}

	public void setEmi_id(Integer emi_id) {
		this.emi_id = emi_id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	

}
