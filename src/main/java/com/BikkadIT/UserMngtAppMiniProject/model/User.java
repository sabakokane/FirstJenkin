package com.BikkadIT.UserMngtAppMiniProject.model;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data
public class User {
	
	private String fname;

	private String lname;

	private String email;

	private String phone;

	private Date dob;

	private String gender;

	private String country;

	private String state;

	private String city;

	private String password;

	private String accStatus;
	

}
