package com.example.school.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.school.Model.student;

public interface studentRepositary extends JpaRepository<student, Integer> {

}
