package com.BikkadIT.UserMngtAppMiniProject.service;

import java.util.List;

import com.BikkadIT.UserMngtAppMiniProject.entities.City;
import com.BikkadIT.UserMngtAppMiniProject.entities.Country;
import com.BikkadIT.UserMngtAppMiniProject.entities.State;
import com.BikkadIT.UserMngtAppMiniProject.model.User;

public interface UserServiceI {

	
    public List<Country> getAllCountries();
	
	public List<State> getAllStates(int countryId);
	
	public List<City> getAllCities(int stateId);
	
	public boolean saveUser(User user);
}
