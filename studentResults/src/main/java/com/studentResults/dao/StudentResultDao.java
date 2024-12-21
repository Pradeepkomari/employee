package com.studentResults.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.studentResults.entity.StudentResultEntity;
import com.studentResults.repositroy.StudentResultRepository;

@Repository
public class StudentResultDao {
	
	@Autowired
	StudentResultRepository	srr;
	
	public String addResult(List<StudentResultEntity> s) {
		srr.saveAll(s);
		return "Stored";
	}

}
