package Assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicatesAndCountString {

	public static void main(String[] args) 
	{
		String s="i am from mysore i am";
		String[] str = s.split(" ");
		LinkedHashSet<String> sh=new LinkedHashSet<>();
		
		for (int i = 0; i < str.length; i++) 
		{
			sh.add(str[i]);
		}
		
		System.out.println(sh);
		
		for (String str2 : sh) 
		{
			int count=0;
			
			for (int i = 0; i < str.length; i++) 
			{
				if(str2.equals(str[i]))
				{
					System.out.println(str2+"="+(i+1));
					break;
				}
			}
//			if(count>1)
//			{
//				System.out.println(str2+"="+count);
//			}
		}
	}

}
