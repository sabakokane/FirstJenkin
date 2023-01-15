package com.BikkadIT.UserMngtAppMiniProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.BikkadIT.UserMngtAppMiniProject.entities.Country;
import com.BikkadIT.UserMngtAppMiniProject.entities.State;
import com.BikkadIT.UserMngtAppMiniProject.service.UserServiceI;

@RestController
public class UserController {
	@Autowired
	private UserServiceI userServiceI;
	
	@GetMapping(value="/getAllCountries",produces = "application/json")
	public ResponseEntity<List<Country>> getAllCountries(){
		List<Country> allCountries = userServiceI.getAllCountries();
		return new ResponseEntity<List<Country>>(allCountries,HttpStatus.OK);
		
	}
	
	@GetMapping(value="/getAllStates/{countryId}",produces = "application/json")
	public ResponseEntity<List<State>> getAllStates(@PathVariable int countryId){
		List<State> allStates = userServiceI.getAllStates(countryId);
		return new ResponseEntity<List<State>>(allStates,HttpStatus.OK);
		
	}
	

}
