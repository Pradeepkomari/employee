package com.studentResults.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.studentResult.pojo.MarksPojo;
import com.studentResult.pojo.StudentPojo;
import com.studentResults.dao.StudentResultDao;
import com.studentResults.entity.StudentResultEntity;

@Service
public class StudentResultService {

    @Autowired
    RestTemplate rt;
    @Autowired
    StudentResultDao srd;

    public String addResult() {
        String url1 = "http://localhost:8081/studentDetails/get";
        String url2 = "http://localhost:8082/mark/getAll";

        // Fetch the student data from API 1
        List<StudentPojo> students = rt
                .exchange(url1, HttpMethod.GET, null, new ParameterizedTypeReference<List<StudentPojo>>() {
                }).getBody();

        // Fetch the marks data from API 2
        List<MarksPojo> marks = rt
                .exchange(url2, HttpMethod.GET, null, new ParameterizedTypeReference<List<MarksPojo>>() {
                }).getBody();

        // Check for null responses
        if (students == null || marks == null) {
            return "No data found from one or more APIs.";
        }

        List<StudentResultEntity> result = new ArrayList<>();
        
        
        
		for (int i = 0; i < students.size(); i++) {

			StudentPojo det2 = students.get(i);
			for (int j = 0; j < marks.size(); j++) {
				MarksPojo mar2 = marks.get(j);
				StudentResultEntity res = new StudentResultEntity();

				if (det2.getRollNumber() == mar2.getRollNumber()) {
					res.setName(det2.getName());
					res.setRollNumber(det2.getRollNumber());
					res.setTotal(mar2.getSem1Total() + mar2.getSem2total());
					res.setPercentage(res.getTotal() / 2);
					result.add(res);
					break;
				}

			}
		}
		return srd.addResult(result);

	}
}        

     /*   // Loop through students and marks to combine the data
        for (StudentPojo s : students) {
            // Find matching marks for the student
            for (MarksPojo m : marks) {
                if (s.getRollNumber() == m.getRollNumber()) {
                    StudentResultEntity rst = new StudentResultEntity();

                    // Set values in the result entity
                    rst.setName(s.getName());  // Set student name
                    rst.setRollNumber(s.getRollNumber());  // Set roll number
                    rst.setTotal(m.getSem1Total() + m.getSem2total());  // Set total marks
                    rst.setPercentage(rst.getTotal() / 2);  // Set percentage (assuming max 200)

                    // Add the result entity to the result list
                    result.add(rst);
                    break;  // Exit inner loop once the student is found and result is added
                }
            }
        }

        // Store the result in the database
        return srd.addResult(result);
    }
}*/
