package com.studentDetails.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.studentDetails.entity.StudentDetails;
import com.studentDetails.repository.StudentDetailsRepository;

@Repository
public class StudentDetailsDao {

	@Autowired
	StudentDetailsRepository sdr;

	public String addDetails(StudentDetails s) {
		sdr.save(s);
		return "Stored";
	}

	public String updateDetails(int rollnum, StudentDetails s) {
		sdr.save(s);
		return "Updated";
	}

	public String deleteById(int id) {
		sdr.deleteById(id);
		return "Deleted";
	}

	public StudentDetails getById(int id) {
		return sdr.findById(id).get();
	}

	public String addByList(List<StudentDetails> s) {
		sdr.saveAll(s);
		return "Stored";
	}

	public List<StudentDetails> getAll() {
		return sdr.findAll();
	}

}
