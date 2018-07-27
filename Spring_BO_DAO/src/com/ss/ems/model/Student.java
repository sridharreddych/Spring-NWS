package com.ss.ems.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student007",schema="user1")
public class Student {
	/*
	@Id
	private int id;*/
	  @Id
//	    @Column(name="id")
	    private int id;
	private String name;
	private String email;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}


/*----------------
package net.viralpatel.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

 
@Entity
@Table(name="EMPLOYEE")
public class Employee {
 
    @Id
    @Column(name="employee_id")
    private Long employeeId;
 
    @Column(name="firstname")
    private String firstname;
 
    @Column(name="lastname")
    private String lastname;
    

    //Getter and Setter methods	

}
------------*/