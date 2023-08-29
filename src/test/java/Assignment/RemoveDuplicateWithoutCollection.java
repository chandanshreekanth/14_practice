package Assignment;

import org.testng.annotations.Test;

public class RemoveDuplicateWithoutCollection {

	public static void main(String[] args) 
	{
		String s="deleeeddl";
		
		String s1="";
		
		for (int i = 0; i <s.length(); i++) 
		{
			char ch=s.charAt(i);
			
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+s.charAt(i);
			}
			
		}
		System.out.println(s1);

	}
	
	@Test
	
	public void RemoveDuplicateWithoutCollection()
	{
		String s="delleelld";
		String s1="";
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if(s1.indexOf(ch)==-1)
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
	}
	
	@Test
	public void reverse()
	{
		
		        String input = "Dream big";
		        String reversed = reverseString(input);
		        System.out.println("Original string: " + input);
		        System.out.println("Reverse of given string: " + reversed);
		    }

		    public static String reverseString(String str) {
		        String reversedStr = "";
		        for (int i = str.length() - 1; i >= 0; i--) {
		            reversedStr = reversedStr + str.charAt(i);
		        }
		        return reversedStr;
		    }
		9108316607
}
