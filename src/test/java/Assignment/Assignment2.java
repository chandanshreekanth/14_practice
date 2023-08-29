package Assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//	String sentence = sc.nextLine();
//	sc.close();
	
	String sentence = "cvbb5555/1234/55555/88uu/1234";
	
	String[] splitWord = sentence.split("/");
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
