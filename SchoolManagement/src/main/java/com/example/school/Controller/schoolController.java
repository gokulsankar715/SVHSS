package com.example.school.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.school.Model.student;
import com.example.school.Repositary.studentRepositary;
import com.example.school.Service.schoolService;

@RestController
@RequestMapping("/school/svhss")
public class schoolController {

	@Autowired
	private studentRepositary repo;

	@Autowired
	private schoolService userService;

	@GetMapping("/getStudentList")
	public List<student> getStudentList() {
		return repo.findAll();
	}

	@GetMapping("/{studentid}")
	public student getStudent(@PathVariable int studentid) {
		return repo.findById(studentid).get();
	}

	@DeleteMapping("/{studentid}")
	public String deleteStudent(@PathVariable int studentid) {
		String result = "Failiure";
		if (repo.findById(studentid) != null) {
			repo.deleteById(studentid);
			result = "Success";
		}
		return result;
	}

	@PostMapping("")
	public ResponseEntity<?> Addboard(@RequestBody student user) {
		student add = userService.saveMyUser(user);
		return new ResponseEntity<student>(add, HttpStatus.CREATED);
	}
}
