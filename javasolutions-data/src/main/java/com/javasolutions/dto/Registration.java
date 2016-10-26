package com.javasolutions.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="Registration")
public class Registration
{
	@Column
	private String name;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column
	private Integer mob_no;
	
	@Column
	private Integer fees;
	
	@Column
	private String dob;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMob_no() {
		return mob_no;
	}
	public void setMob_no(Integer mob_no) {
		this.mob_no = mob_no;
	}
	public Integer getFees() {
		return fees;
	}
	public void setFees(Integer fees) {
		this.fees = fees;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
	
	
	
	
	
	
	

}
