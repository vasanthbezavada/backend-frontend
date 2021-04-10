package com.vasanth.backend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String workingTechnology;
	private String experience;
	
	public Person(int id, String firstName, String lastName, String workingTechnology, String experience) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.workingTechnology = workingTechnology;
		this.experience = experience;
	}
	public Person() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getWorkingTechnology() {
		return workingTechnology;
	}
	public void setWorkingTechnology(String workingTechnology) {
		this.workingTechnology = workingTechnology;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", workingTechnology="
				+ workingTechnology + ", experience=" + experience + "]";
	}
}
