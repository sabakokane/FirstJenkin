package com.BikkadIT.UserMngtAppMiniProject.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Data

public class UserAccEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="USER_ID")
	private int userId;
  
	@Column(name="FIRST_NAME")
	private String fname;

	@Column(name="LAST_NAME")
	private String lname;

	@Column(name="EMAIL_ID")
	private String email;

	@Column(name="PHONE_NUM")
	private String phone;

	@Column(name="DOB")
	private Date dob;

	@Column(name="GENDER")
	private String gender;

	@Column(name="COUNTRY")
	private String country;

	@Column(name="STATE")
	private String state;

	@Column(name="CITY")
	private String city;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="ACC_STATUS")
	private String accStatus;
}
