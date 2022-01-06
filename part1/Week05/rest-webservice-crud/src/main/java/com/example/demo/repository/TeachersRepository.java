package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Teachers;

@Repository
public interface TeachersRepository extends JpaRepository<Teachers, Long> {

}
