package Assignment;

import java.util.Collection;
import java.util.LinkedHashSet;

public class RemoveDuplicatesAndCountCharacter {

	public static void main(String[] args) 
	{
			String s="chandan";
			System.out.println(s);
			
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
					System.out.println(ch+"="+count);
				}
			}
	}

}
