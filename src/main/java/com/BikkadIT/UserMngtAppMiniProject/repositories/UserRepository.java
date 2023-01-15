package com.BikkadIT.UserMngtAppMiniProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.UserMngtAppMiniProject.entities.UserAccEntity;
@Repository
public interface UserRepository extends JpaRepository<UserAccEntity, Integer> {

}
