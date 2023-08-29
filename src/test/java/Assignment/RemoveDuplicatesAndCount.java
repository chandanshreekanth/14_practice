package Assignment;

import java.util.LinkedHashSet;

public class RemoveDuplicatesAndCount {

	public static void main(String[] args) 
	{
		String s="im working in im in amdocs";
		
	String[] sp = s.split(" ");
	for (int i = 0; i < sp.length; i++) 
	{
		System.out.print(sp[i]+" ");
	}
	
	System.out.println();
	LinkedHashSet<String> sh=new LinkedHashSet<>();
			
		for (int i = 0; i < sp.length; i++) 
		{
			sh.add(sp[i]);
		}
		
		System.out.println(sh);
		
		for (String ch : sh) 
		{
			int count=0;
			for (int i = 0; i < sp.length; i++) 
			{
				if(ch.equals(sp[i]))
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
