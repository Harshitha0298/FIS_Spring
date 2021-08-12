package com.fis.springjpa.employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController 
@RequestMapping(path="/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;

	@GetMapping(path="/add")
	public Iterable<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@PostMapping(path="/edit")
	public String addEmployee(@RequestBody Employee employee) {
		employeeRepository.save(employee);
		return "Saved";
	}

	

}
