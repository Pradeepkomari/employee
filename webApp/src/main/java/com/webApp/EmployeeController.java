package com.webApp;

import java.util.Comparator;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@GetMapping("/employee")
	public Employee get(@RequestBody Employee e) {
		return e;
	}

	@GetMapping("/employee1")
	public String get1(@RequestBody Employee e) {
		return e.getName() + " " + e.getGender();
	}

	@GetMapping("/all")
	public List<Employee> getAll(@RequestBody List<Employee> e) {
		return e;
	}
	
	@GetMapping("/Max")
	public Employee getMax(@RequestBody List<Employee> e){
		
		Employee max = e.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).findFirst().get();
		return max ;
	}
	
	
	
	

}
