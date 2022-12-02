package com.java.lambda;

public class LambdaExpression {
	
	public interface PerformOperation {
		public boolean operation(int x);
	}
	
	public static void main(String[] args) {
		PerformOperation isOdd = x-> x%2 != 0;	
		
		System.out.println("9 is Odd Number ? "+isOdd.operation(9));
		System.out.println("10 is Even Number? "+isOdd.operation(10));		
		
		PerformOperation isPrime = x-> {
			boolean flag = false;
			for (int i = 2; i <= x / 2; ++i) {
			      if (x % i == 0) {
			        flag = true;
			        break;
			      }
			    }
			if (!flag)
			      return true;
			    else
			     return false;
			};
	
		System.out.println("7 is Prime Number ?"+isPrime.operation(7));
		System.out.println("29 is Prime Numver ?"+isPrime.operation(29));
		
		PerformOperation isPalindrome = x -> {
			int newNum = 0, remainder, temp;
            temp = x;
            
            while(temp != 0){
                  remainder = temp % 10;
                  newNum = newNum*10 + remainder;
                  temp = temp/10;
            }            
            if (newNum == x)
				 return true;
			else
				return false;			
		};
		
		System.out.println("101 is palindrome ?"+isPalindrome.operation(101));
		System.out.println("100 is palindrome ?"+isPalindrome.operation(100));
	}

}
