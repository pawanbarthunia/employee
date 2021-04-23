package com.springboot.mongo.modal;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collation = "employee")
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String designation;
	private char gender;
	private double salary;
	private long age;
	private List<Address> address;
	private Department department;
	
	



		public Employee(int empId, String empName, String designation, char gender, double salary, long age,
			List<Address> address, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.gender = gender;
		this.salary = salary;
		this.age = age;
		this.address = address;
		this.department = department;
	}




		public Department getDepartment() {
		return department;
	}




	public void setDepartment(Department department) {
		this.department = department;
	}

	
	
	public long getAge() {
		return age;
	}
	public void setAge(long age) {
		this.age = age;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 @Override
	    public String toString() {
	    	ObjectMapper mapper = new ObjectMapper();
	    	
	    	String jsonString = "";
			try {
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				jsonString = mapper.writeValueAsString(this);
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
	    	return jsonString;
	    }
	
	
}
