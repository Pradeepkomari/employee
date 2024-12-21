package com.studentMarkSheet.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentMarkSheet.dao.StudentMarkSheetDao;
import com.studentMarkSheet.entity.StudentMarkSheet;

@Service
public class StudentMarkSheetService {

	@Autowired
	StudentMarkSheetDao smsd;

	public String addMarks(StudentMarkSheet s) {
		s.setSem1Total(s.getSem1Pratical() + s.getSem1Theory());
		s.setSem2total(s.getSem2Pratical() + s.getSem2Theory());
		return smsd.addMarks(s);
	}
	
	public StudentMarkSheet getByRollnum(int rollnum) {
		return smsd.getByRollnum(rollnum);
	}
	
	public List<StudentMarkSheet> getAll(){
		return smsd.getAll();
	}
	

}
