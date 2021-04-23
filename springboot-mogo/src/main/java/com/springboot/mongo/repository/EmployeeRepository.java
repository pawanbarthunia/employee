package com.springboot.mongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springboot.mongo.modal.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, Integer> {
	
	List<Employee> findByEmpName(String name);
	
	@Query("{'department.deptName': ?0}")
	List findByDepartment(String deptName);
	

}
