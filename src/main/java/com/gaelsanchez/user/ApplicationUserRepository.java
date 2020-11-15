package com.gaelsanchez.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Integer> {

	ApplicationUser findByUserName(String username);
}
