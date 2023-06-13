package Sudhakar;

import java.util.Scanner;

public class EvenOddNum 
{
	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		 int sc = scan.nextInt();
		scan.close();
	//	int no=1;
		if (sc%2==0) 
		{
			System.out.println(sc+" =even");
		}
		
		else
		{
			System.out.println(sc+" =odd");
		}
		
	}
}
