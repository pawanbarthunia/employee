package com.springboot.mongo.modal;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@Document
public class User {
private Integer userId;
private String username;
private String pasword;
private String name;
private String mobNumber;
public Integer getUserId() {
	return userId;
}
public void setUserId(Integer userId) {
	this.userId = userId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPasword() {
	return pasword;
}
public void setPasword(String pasword) {
	this.pasword = pasword;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobNumber() {
	return mobNumber;
}
public void setMobNumber(String mobNumber) {
	this.mobNumber = mobNumber;
}

}
