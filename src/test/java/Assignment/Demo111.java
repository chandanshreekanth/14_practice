package Assignment;

import java.util.LinkedHashSet;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Generic.Generic_Class;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo111 extends Generic_Class {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		//String s="testyantra";
		LinkedHashSet<Character> sh=new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) 
		{
			sh.add(s.charAt(i));
		
		}
		System.out.println(sh);
		
		for (Character ch : sh) 
		{
			int count=0;
			for (int i = 0; i < s.length(); i++) 
			{
				
				if (ch==s.charAt(i)) 
				{
					count++;
					
				}
				
			}
			//System.out.print(ch+"="+count+"  ");
			if(count>1)
			{
				System.out.print(ch+"="+count+"  ");
			}
				
		}
		
	}
}
