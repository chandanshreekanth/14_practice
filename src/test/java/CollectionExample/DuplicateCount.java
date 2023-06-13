package CollectionExample;

import java.util.LinkedHashSet;

public class DuplicateCount {

	public static void main(String[] args) 
	{
		String s1="Testyantra";
		String s2 = s1.toLowerCase();
		
		LinkedHashSet<Character> ch=new LinkedHashSet<>();
		for (int i = 0; i < s2.length(); i++) 
		{
			ch.add(s2.charAt(i));
		}
		
		System.out.println(ch);
		
		for (Character sh : ch) 
		{
			int count=0;
			for (int i = 0; i < s2.length(); i++) 
			{
				if (sh==s2.charAt(i)) 
				{
					count++;
				}
				
			}
			if(count>1)
			{
				System.out.println(sh+"="+count);

			}
		}
	}

}
