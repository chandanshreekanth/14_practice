package Sudhakar;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int sc = scan.nextInt();
		scan.close();
		
		//int sc=7;
		
		boolean flag = true;
		if(sc<1)
		{
			flag=false;
		}
		
		for (int i = 2; i < sc; i++) 
		{
			if(sc%i==0)
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("prime no "+sc);
		}
		
		else 
		{
			System.out.println("lo "+sc+" prime number illa ");
		}
		
		
		

	}

}
