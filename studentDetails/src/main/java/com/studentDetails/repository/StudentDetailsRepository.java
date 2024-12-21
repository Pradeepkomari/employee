package com.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentDetails.entity.StudentDetails;

public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

}
