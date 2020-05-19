package com.techie.studentinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techie.studentinfo.model.Students;

@Repository	
public interface StudentsJpaRepository extends JpaRepository<Students, Integer> {
	
	public Students findByFirstName(String firstName);

}
