package Assignment;

import java.util.LinkedHashSet;

public class OrderOfOccurance {

	public static void main(String[] args)
	{
		String s="chandan123";
		LinkedHashSet<Character> sh=new LinkedHashSet<>();
		
		for (int i = 0; i < s.length(); i++) 
		{
			sh.add(s.charAt(i));
		}
		System.out.println(sh);
		
		for (Character c : sh) 
		{
			
			
			for (int i = 0; i < s.length(); i++) 
			{
				if(c==s.charAt(i))
				{
					System.out.println(c+"="+(i+1));
					break;
				}
			}
			
		}

	}

}
