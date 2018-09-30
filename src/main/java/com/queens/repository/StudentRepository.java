package com.queens.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.queens.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
}
