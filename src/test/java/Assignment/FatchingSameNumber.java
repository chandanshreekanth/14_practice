package Assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.openqa.selenium.TakesScreenshot;

public class FatchingSameNumber {

	
//	public static void main(String[] args) 
//	{
//		int n=12300;
//		int sum=0;
//		
//		while(n!=0)
//		{
//			System.out.print(sum=n%10);
//			
//			
//			n=n/10;
//			//System.out.println(sum);
//		}
//		
//		
//
//	}


	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//	String sentence = sc.nextLine();
//	sc.close();
	
	String sentence = "cvbb5555/1111/55555/88uu/1234";
	
	String[] splitWord = sentence.split("/");
	System.out.println(splitWord.length);
	for (int i = 0; i < splitWord.length; i++) 
	{
		int count = 1;
		String word = splitWord[i];
		char[] charWord = word.toCharArray();
		for (int j = 0; j < charWord.length-1; j++) 
		{
			if(charWord[j]==charWord[j+1])
			{
				count++;
			}
			else 
			{
				break;
			}
		}
		if(count==4) 
		{
			System.out.println(word);
		}
		
	}
	}



}
