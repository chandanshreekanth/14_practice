package Sudhakar;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
//	{
//		Scanner scan=new Scanner(System.in);
//		String sc = scan.nextLine();
//		
//	//	String sc="chan manju sudha";
//		
//		String[] arr = sc.split(" ");
//		
//		//System.out.println(arr[0]);
//		
//		for (String word : arr) {
//			
//			String rev=""; 
//			for (int i = word.length()-1; i >= 0; i--) 
//			{
//				rev=rev+word.charAt(i);
//			}
//			System.out.print(rev);
//			System.out.print(" ");
//		}
//		
//		
//	}
	{
		String sc="chan manju sudha";
		
		String[] arr = sc.split(" ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			String str = arr[i];
			
			for (int j =str.length()-1 ; j>=0; j--) 
			{
				String rev = "";
				rev=rev+str.charAt(j);
				System.out.print(rev+"");

			}
			System.out.print(" ");
					}
		
		
		
	}
	
}
