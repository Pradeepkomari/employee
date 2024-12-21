package com.studentMarkSheet.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.studentMarkSheet.entity.StudentMarkSheet;
import com.studentMarkSheet.repository.StudentMarkSheetRepository;

@Repository
public class StudentMarkSheetDao {

	@Autowired
	StudentMarkSheetRepository smsr;

	public String addMarks(StudentMarkSheet s) {
		smsr.save(s);
		return "Stored";
	}
	
	public StudentMarkSheet getByRollnum(int rollnum) {
		return smsr.getByRollnum(rollnum);
	}
	
	public List<StudentMarkSheet> getAll(){
		return smsr.findAll();
	}
	
	

}
