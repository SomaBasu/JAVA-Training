package com.java.quadraticequation;

public class QuadraticEquation {
	
	public static void quadraticDataCheck(int a, int b, int c) {
		double dis = b * b + 4.0 * a * c;

		if (dis > 0) {
			double r1 = (-b + Math.pow(dis, 0.5)) / (2.0 * a);
			double r2 = (-b - Math.pow(dis, 0.5)) / (2.0 * a);
			System.out.println("The Roots are " + r1 + " and " + r2);
		} else if (dis == 0) {
			double r1 = -b / (2.0 * a);
			System.out.println("The Roots is " + r1);
		} else {
			System.out.println("The Roots are not real. ");
		}
	}

	public static void main(String[] args) {
		quadraticDataCheck(1,4,4);

	}

}
