package com.java.candidate;

public class Candidate {
	public String name;
	public int age;
	public String education;
	
	public Candidate() {
		super();
	}

	public Candidate(String name, int age, String education) {
		super();
		this.name = name;
		this.age = age;
		this.education = education;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	@Override
	public String toString() {
		return "Candidate [name=" + name + ", age=" + age + ", education=" + education + "]";
	}		
}
