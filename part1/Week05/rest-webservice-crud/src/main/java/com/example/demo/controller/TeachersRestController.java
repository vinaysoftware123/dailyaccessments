package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.Teachers;
import com.example.demo.repository.TeachersRepository;

public class TeachersRestController {

	@Autowired
    private TeachersRepository teachersRepository;

	@PostMapping("/add")
	public Teachers addTeachers(@RequestBody Teachers teachers ) {
		return teachersRepository.save(teachers);
	}

	@GetMapping("/get")
	public List<Teachers> listTeachers() {
		return teachersRepository.findAll();
	}

	@PutMapping("/edit")
	public Teachers updateTeachers(@RequestBody Teachers teachers ) {
		return teachersRepository.save(teachers);
	}

	@DeleteMapping("/delete")
	public String deleteTeachers(@RequestBody Teachers teachers ) {
		teachersRepository.delete(teachers);
		return "Deleted teacher record";
	}
}
