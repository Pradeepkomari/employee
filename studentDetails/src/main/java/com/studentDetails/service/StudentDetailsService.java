package com.studentDetails.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentDetails.dao.StudentDetailsDao;
import com.studentDetails.entity.StudentDetails;
import com.studentDetails.exception.AgeException;

@Service
public class StudentDetailsService {

	@Autowired
	StudentDetailsDao sdd;

	public String addDetails(StudentDetails s) throws AgeException {

		if (s.getAge() >= 18) {
			return sdd.addDetails(s);
		} else {
			throw new AgeException("Age less Than 18");
		}
	}

	public String updateDetails(int rollNum, StudentDetails s) throws AgeException {
		if (s.getAge() >= 18) {
			return sdd.updateDetails(rollNum, s);
		} else {
			throw new AgeException("Age less Than 18");
		}
	}

	public String deleteById(int id) {
		return sdd.deleteById(id);
	}

	public StudentDetails getById(int id) {
		return sdd.getById(id);
	}
	
	
	
	public List<StudentDetails> getAll() {
		return sdd.getAll();
	}

	public String addByList(List<StudentDetails> s) {

		List<StudentDetails> list = new ArrayList<>();

		for (int i = 0; i < s.size(); i++) {
			if (s.get(i).getAge() >= 18) {
				list.add(s.get(i));
			}
		}

		return sdd.addByList(list);
	}

}
