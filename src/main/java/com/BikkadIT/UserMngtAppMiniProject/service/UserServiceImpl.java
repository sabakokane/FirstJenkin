package com.BikkadIT.UserMngtAppMiniProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.UserMngtAppMiniProject.entities.City;
import com.BikkadIT.UserMngtAppMiniProject.entities.Country;
import com.BikkadIT.UserMngtAppMiniProject.entities.State;
import com.BikkadIT.UserMngtAppMiniProject.model.User;
import com.BikkadIT.UserMngtAppMiniProject.repositories.CountryRepository;
import com.BikkadIT.UserMngtAppMiniProject.repositories.StateRepository;
import com.BikkadIT.UserMngtAppMiniProject.repositories.UserRepository;
@Service
public class UserServiceImpl implements UserServiceI {

	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private StateRepository stateRepository;
	
	
	@Override
	public List<Country> getAllCountries() {
		List<Country> countries = countryRepository.findAll();
		return countries;
	}

	@Override
	public List<State> getAllStates(int countryId) {
		List<State> States = stateRepository.findByCountryId(countryId);
		return States;
	}

	@Override
	public List<City> getAllCities(int stateId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
