package com.BikkadIT.UserMngtAppMiniProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserMngtAppMiniProject.entities.City;
@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
