package com.BikkadIT.UserMngtAppMiniProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserMngtAppMiniProject.entities.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
