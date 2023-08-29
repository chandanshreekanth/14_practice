package Assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		 int nu = scan.nextInt();
			int fact=1;
			int no=3;
			for (int i = 1; i <=nu; i++) 
			{
				fact=fact*i;
					
			}
			System.out.println(fact);
	}

}
