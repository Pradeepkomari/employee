package com.studentResults.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentResults.service.StudentResultService;

@RestController
@RequestMapping("/result")
public class StudentResultController {

	@Autowired
	StudentResultService srs;

	@PostMapping("/add")
	public String addResult() {
		return srs.addResult();
	}

}
