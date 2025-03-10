package com.studentDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentDetails.entity.StudentDetails;
import com.studentDetails.exception.AgeException;
import com.studentDetails.service.StudentDetailsService;

@RestController
@RequestMapping("/studentDetails")
public class StudentDetailsController {

	@Autowired
	StudentDetailsService sds;

	@PostMapping("/add")
	public String addDetails(@RequestBody StudentDetails s) throws AgeException {
		return sds.addDetails(s);
	}

	@PutMapping("/update/{rollnum}")
	public String updateDetails(@PathVariable int rollnum, @RequestBody StudentDetails s) throws AgeException {
		return sds.updateDetails(rollnum, s);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		return sds.deleteById(id);
	}

	@GetMapping("/get/{id}")
	public StudentDetails getById(@PathVariable int id) {
		return sds.getById(id);
	}

	@GetMapping("/get")
	public List<StudentDetails> getAll() {
		return sds.getAll();
	}

	@PostMapping("/postbyList")
	public String addByList(@RequestBody List<StudentDetails> s) {
		return sds.addByList(s);
	}

}
