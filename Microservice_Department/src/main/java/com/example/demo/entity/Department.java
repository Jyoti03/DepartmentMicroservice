package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Department {
	
	private Long DepartmentId;
	private String DepatmentName;
	private String DepartmentAddress;
	private String Departmentcode;
	
	private Date CreateDate;
	

}
