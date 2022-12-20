package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User_Report")
public class User {

	@Id
	@GeneratedValue
	private Integer id;
	private String uName;
	private String email;
	private String moNo;
	private String gender;
	private String SSN;
	private String planName;
	private String planStatus;

}
