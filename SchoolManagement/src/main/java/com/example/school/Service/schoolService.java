package com.example.school.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.school.Model.student;
import com.example.school.Repositary.studentRepositary;

@Service
public class schoolService {

	@Autowired
	private studentRepositary StudentRepositary;

	public student saveMyUser(student student) {
		return StudentRepositary.save(student);
	}

}
