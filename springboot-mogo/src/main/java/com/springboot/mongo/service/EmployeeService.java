package com.springboot.mongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mongo.modal.Employee;
import com.springboot.mongo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired	
	private EmployeeRepository employeeRepository;
	
	public String addEmployee(Employee emp) {
		AddEmployee addEmp=(employee)->{
		Employee e=	employeeRepository.save(emp);
		if(e!=null) {
			return "Employee id:-"+e.getEmpId()+"persist into DB";
		}else {
			return "Employee id:-"+e.getEmpId()+"not persist into DB";
		}};
		
		return addEmp.addEmployee(emp);
	}

	public List<Employee> getAllEmployee() {
		FindAllEmplyeeDetail findAllEmployee=()->{return employeeRepository.findAll();};
		return findAllEmployee.getAllEmployee();
	}

	public Employee getEmployee(Integer empId) {
		EmployeeDetail empDet=(employeeId)->{return employeeRepository.findById(employeeId).get();};
		return empDet.getEmployee(empId);
	}

	public Employee delEmployee(Integer empId) {
		EmployeeDetail empDet=(employeeId)->{return employeeRepository.findById(employeeId).get();};
		DeleteEmployee deEmployee=(emp)->{
			 emp=empDet.getEmployee(empId);
			employeeRepository.delete(emp);
			return emp;
		};
		
		return deEmployee.deleteEmployee(empDet.getEmployee(empId));
	}

}
