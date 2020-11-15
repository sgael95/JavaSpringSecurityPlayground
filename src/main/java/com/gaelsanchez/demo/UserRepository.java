package com.gaelsanchez.demo;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserAccount, Integer> {

	
}
