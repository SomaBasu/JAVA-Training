package com.java.book;

import com.java.author.Author;

public class Book {
	private String book_id;
	private String book_name;
	private int book_pages;
	private int book_cost;
	private int book_number;
	private Author author;
	
	public Book() {
		super();		
	}

	public Book(String book_id, String book_name, int book_pages, int book_cost, int book_number, Author author) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_pages = book_pages;
		this.book_cost = book_cost;
		this.book_number = book_number;
		this.author = author;
	}

	public String getBook_id() {
		return book_id;
	}

	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public int getBook_pages() {
		return book_pages;
	}

	public void setBook_pages(int book_pages) {
		this.book_pages = book_pages;
	}

	public int getBook_cost() {
		return book_cost;
	}

	public void setBook_cost(int book_cost) {
		this.book_cost = book_cost;
	}

	public int getBook_number() {
		return book_number;
	}

	public void setBook_number(int book_number) {
		this.book_number = book_number;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", book_name=" + book_name + ", book_pages=" + book_pages + ", book_cost="
				+ book_cost + ", book_number=" + book_number + ", author=" + author + "]";
	}

	
	
}
