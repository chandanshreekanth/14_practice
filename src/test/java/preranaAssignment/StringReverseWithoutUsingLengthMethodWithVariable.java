package preranaAssignment;

import java.util.Iterator;

public class StringReverseWithoutUsingLengthMethodWithVariable {

	public static void main(String[] args) 
	{
		
		String str="abcde";
		char[] s = str.toCharArray();
		System.out.println(s[1]);
		int count=0;
		for (char c : s) 
		{
			count++;
		}
		System.out.println(count);
		
		String rev="";
		
		for (int i = count-1;i>=0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		
//		String rev="";
//		int cout = str.compareTo(rev);
//		System.out.println(cout);
	}

}
