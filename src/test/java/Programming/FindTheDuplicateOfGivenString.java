package Programming;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class FindTheDuplicateOfGivenString 
{
//
//	public static void main(String[] args) 
//	{
//		String str="Testyantra";
//		String s = str.toLowerCase();
//		
//		LinkedHashSet<Character> sh=new LinkedHashSet<>();
//		for (int i = 0; i < s.length(); i++) 
//		
//		{
//			sh.add(s.charAt(i));
//		}
//		
//		System.out.println(sh);
//		
//		for (Character ch : sh) 
//		{
//			int count=0;
//			for (int i = 0; i < s.length(); i++) 
//			{
//				if (ch==s.charAt(i)) 
//				{
//					count++;
//				}
//			}
//			
//			if(count>1)
//			{
//				System.out.println(ch+"="+count);
//
//			}
//		}
//	}
//
	public static void main(String[] args) 
	{
		String c="Chandan";
		
		String s = c.toLowerCase();
		
		LinkedHashSet<Character> sh=new LinkedHashSet<>();
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
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ch +"="+count);

			}
			
		}
		
	}
}
