package com.application.DMS.repository;
import java.util.*;

//@author S569628-Rushika Reddy Pingili

import org.springframework.data.repository.CrudRepository;

import com.application.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog,Integer>{
	List<Dog> findByName(String name);
}
