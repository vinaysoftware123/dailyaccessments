package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Courses;
import com.example.demo.repository.CoursesRepository;

@RestController
@RequestMapping("/courses")
public class CoursesRestController {

	@Autowired
    private CoursesRepository coursesRepository;

	@PostMapping("/add")
	public Courses addCourses(@RequestBody Courses courses ) {
		return coursesRepository.save(courses);
	}

	@GetMapping("/get")
	public List<Courses> listCourses() {
		return coursesRepository.findAll();
	}

	@PutMapping("/edit")
	public Courses updateCourses(@RequestBody Courses courses ) {
		return coursesRepository.save(courses);
	}

	@DeleteMapping("/delete")
	public String deleteStudent(@RequestBody Courses courses ) {
		coursesRepository.delete(courses);
		return "Deleted Course record";
	}
}
