package com.queens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.queens.entity.UserDetails;

public interface UserDetailsRepository extends JpaRepository<UserDetails, Long>{
	
}
