package com.BikkadIT.UserMngtAppMiniProject.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Data

@Entity
@Table(name="CITY_MASTER")
public class City {

	@Id
	@Column(name="CITY_ID")
	private int cityId;
	
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="CITY_STATEID")
	private int stateId;
}
