package com.springboot.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.mongo.modal.Employee;
import com.springboot.mongo.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping(value = "/addEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addEmployee(@RequestBody Employee employee) {
		return empService.addEmployee(employee);
	}
	
	@GetMapping("/findAllEmployee")
	public List<Employee> getAllEmployee() {
		return empService.getAllEmployee();
	}
	
	@GetMapping("/findEmployee/{empId}")
	public Employee getEmployee(@PathVariable("empId") Integer empId) {
		return empService.getEmployee(empId);
	}
	
	@DeleteMapping("/del/{id}")
	public Employee delEmployee(@PathVariable("id") Integer empId) {
		return empService.delEmployee(empId);
	}
	

}
