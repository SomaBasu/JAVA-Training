package com.java.author;

public class Author {
	private String author_name;
	private int author_age;
	private String author_gender;
	
	public Author() {
		super();		
	}

	public Author(String author_name, int author_age, String author_gender) {
		super();
		this.author_name = author_name;
		this.author_age = author_age;
		this.author_gender = author_gender;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public int getAuthor_age() {
		return author_age;
	}

	public void setAuthor_age(int author_age) {
		this.author_age = author_age;
	}

	public String getAuthor_gender() {
		return author_gender;
	}

	public void setAuthor_gender(String author_gender) {
		this.author_gender = author_gender;
	}

	@Override
	public String toString() {
		return "Author [author_name=" + author_name + ", author_age=" + author_age + ", author_gender=" + author_gender
				+ "]";
	}
		
}
