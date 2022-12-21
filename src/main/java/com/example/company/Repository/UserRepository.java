package com.example.company.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.company.Entity.User;

/**
 * @date 16 Dec 2022
 * @Project studentlibrary
 * @user namesh_001543
 */ 
public interface UserRepository extends MongoRepository<User, Integer>{

	List<User> findByName(String username);

	
	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
 