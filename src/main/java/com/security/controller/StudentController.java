package com.security.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.entity.Student;
import com.security.repository.StudentRepository;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository repository;

	List<Student> studnets = Arrays.asList(new Student(1, "AAA"), new Student(2, "BBB"));

	@GetMapping("/students")
	public List<Student> getStudents(HttpServletRequest request) {
		List<Student> listOfStudents = repository.findAll();
		System.out.println("SESSIONID : " + request.getSession().getId());
		return listOfStudents;
	}

	@PostMapping("/students")
	public Student addStudents(HttpServletRequest request, @RequestBody Student student) {
		Student dbStudent = repository.save(student);
		System.out.println("SESSIONID : " + request.getSession().getId());
		return dbStudent;
	}
}
