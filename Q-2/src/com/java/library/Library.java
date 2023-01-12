package com.java.library;

import java.util.Scanner;

import com.java.author.Author;
import com.java.book.Book;

public class Library {
	
	public static void runApp() {	
	       
		Author mark = new Author("Mark", 36, "male");
        Author mona = new Author("Mona", 32, "female");
        Author james = new Author("James", 38, "female");
        Book [] book = new Book[5];
       
        book[0] = new Book("1", "Java Headfirst", 1000, 2000, 4, james);
        book[1] = new Book("2", "Spring", 1200, 3000, 3, mark);
        book[2] = new Book("3", "React", 1000, 3000, 3, mona);
        book[3] = new Book("4", "Jenkin", 1000, 1250000, 3, mark);
        book[4] = new Book("4", "Angular", 1388, 1250000, 3, james);
        
        System.out.println("Welcome to Book Store(Select Book ID from 0 - 4)");
        Scanner sc = new Scanner(System.in);
        int index = 0;
        do {
        	index = Integer.parseInt(sc.nextLine());
            System.out.println(book[index]);
        } while(index<=book.length); 
	}	

	public static void main(String[] args) {
		runApp();
	}

}
