package com.java.question;
import java.util.Scanner;

public class Exam {	
	
	public static void runApp() {
       Question[] qns;
       qns = new Question[3];

       qns[0] = new Question("1", "What is a variable", "01", "02", "03", "04", 2);
       qns[1] = new Question("2", "What is a class", "01", "02", "03", "04", 1);
       qns[2] = new Question("3", "What is a function", "01", "02", "03", "04", 4);
       //qns[3] = new Question("4", "What is a method", "01", "02", "03", "04", 4);
       //qns[4] = new Question("5", "What is a inheritance", "01", "02", "03", "04", 3);

       System.out.println("Welcome to Exam.Are you Ready(Y-Start ,N-Stop)");
        Scanner sc = new Scanner(System.in);
        String startOption = sc.nextLine();

       if (startOption.equalsIgnoreCase("Y")) {
		for (int i=0; i<qns.length;i++) {
		    System.out.println(qns[i].getQuestionId() + ". " + qns[i].getQns());
		    System.out.println(qns[i].getOption1() + " "+ qns[i].getOption2());
		    System.out.println(qns[i].getOption3() + " "+ qns[i].getOption4());
		    
		    if (sc.nextLine().equals(String.valueOf(qns[i].getRightOption()))) {
		       //System.out.println("Yes correct");
		    } else {
		        System.out.println("Your answer is wrong!");
		        System.out.println("Do you want to try again? (Y-Yes, N-No)");
		        if (sc.nextLine().equalsIgnoreCase("Y")) {
		            System.out.println("Please submit the answer again!");
		                i--;
		            }else {
		                continue;
		            }
		        }
			}
        } else if (startOption.equalsIgnoreCase("N")) {
            System.out.println("You are exited to the exam!");
        } else {
            System.out.println("Wrong Input");
        }
	}
	
	public static void main(String[] args) {
		runApp();
	}
 }
