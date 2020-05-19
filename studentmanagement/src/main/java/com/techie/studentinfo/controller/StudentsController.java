package com.techie.studentinfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techie.studentinfo.model.Students;
import com.techie.studentinfo.repository.StudentsJpaRepository;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	private StudentsJpaRepository studentsJpaRepository;
	
	@RequestMapping(value="/all", method=RequestMethod.GET)
	public List<Students> findAll()
	{
		List<Students> stud=studentsJpaRepository.findAll();
		return stud;
	}
	
	@GetMapping(value="/{firstName}")
	public Students findByFirstName(@PathVariable String firstName)
	{
		return studentsJpaRepository.findByFirstName(firstName);
	}
	
	@PostMapping(value="/load")
	public Students load(@RequestBody Students students)
	{
		studentsJpaRepository.save(students);
		return studentsJpaRepository.findByFirstName(students.getFirstName());
		
	}
	@PostMapping(value="/loadAll")
	public List<Students> loadAll(@RequestBody List<Students> students)
	{
		studentsJpaRepository.saveAll(students);
		return studentsJpaRepository.findAll();
		
	}

}
