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

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentsRepository;

@RestController
@RequestMapping("/student")
public class StudentRestController {

        @Autowired
        private StudentsRepository studentRepository;

		@PostMapping("/add")
		public Student addStudents(@RequestBody Student student ) {
			return studentRepository.save(student);
		}

		@GetMapping("/get")
		public List<Student> listStudents() {
			return studentRepository.findAll();
		}

		@PutMapping("/edit")
		public Student updateStudent(@RequestBody Student student ) {
			return studentRepository.save(student);
		}

		@DeleteMapping("/delete")
		public String deleteStudent(@RequestBody Student student ) {
			studentRepository.delete(student);
			return "Deleted Student record";
		}
	}

