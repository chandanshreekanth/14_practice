package Sudhakar;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		
//		Scanner scan=new Scanner(System.in);
//		int sc = scan.nextInt();
//		scan.close();
		
		int no=121;
		int copy = no;
		int sum=0;
		while(no!=0)
		{
			int rev = no%10;
			sum = sum*10+rev;
			no=no/10;
			
		}
		System.out.print(sum);
		
		if(copy==sum)
		{
			System.out.println(" palindrome");
		}
		
		else {
			System.out.println(" not palindrome");
		}

	}

}
