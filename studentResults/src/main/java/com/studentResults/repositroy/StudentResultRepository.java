package com.studentResults.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import com.studentResults.entity.StudentResultEntity;

public interface StudentResultRepository extends JpaRepository<StudentResultEntity, Integer> {

}
