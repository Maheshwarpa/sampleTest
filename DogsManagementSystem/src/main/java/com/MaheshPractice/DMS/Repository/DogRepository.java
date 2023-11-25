package com.MaheshPractice.DMS.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.MaheshPractice.DMS.Models.Dog;


/*
 * Maheshwar Punyam Anand
 */
public interface DogRepository extends CrudRepository<Dog,Integer> {

	
	
	List<Dog> findByName(String name);
	
	
	
}
