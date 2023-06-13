package Programming;

import java.util.Scanner;

public class Factorial {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of number:");
		long num = sc.nextLong();
		long fact=1;
		for(long i=num; i>=1; i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of a number is:"+ fact);
	}

}
