package com.java.animal;

public class Solution {

	public static void main(String[] args) {
		 Bird bird = new Bird();  
         bird.eat();  
         bird.sleep();  
         bird.fly();  
         WildAnimal wild= new WildAnimal ();  
         wild.eat();  
         wild.sleep();  
         wild.kill(); 
         Animal animal=new Bird();
         animal.eat();  
         animal.sleep();
         Animal animal2=new WildAnimal ();
         animal2.eat();  
         animal2.sleep();
	}
}
