package com.studentMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentMarkSheet.entity.StudentMarkSheet;
import com.studentMarkSheet.service.StudentMarkSheetService;

@RestController
@RequestMapping("/mark")
public class StudentMarkSheetController {

	@Autowired
	StudentMarkSheetService smss;

	@PostMapping("/add")
	public String addMarks(@RequestBody StudentMarkSheet s) {
		return smss.addMarks(s);
	}

	@GetMapping("/getbyrollnum/{rollnum}")
	public StudentMarkSheet getByRollnum(@PathVariable int rollnum) {
		return smss.getByRollnum(rollnum);
	}

	@GetMapping("/getAll")
	public List<StudentMarkSheet> getAll() {
		return smss.getAll();
	}

}
