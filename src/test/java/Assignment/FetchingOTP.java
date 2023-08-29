package Assignment;

import org.testng.annotations.Test;

public class FetchingOTP {

	public static void main(String[] args) 
	{
		String s="df/1234/df342/vcv55444/44444/tht";
		String[] sh = s.split("/");
		System.out.println(sh.length);
		int count=0;
		for (int i = 0; i < sh.length; i++) 
			{
				Integer.parseInt(sh[i]);
				char[] first = sh[i].toCharArray();
				//System.out.println(first);
			//	System.out.println(first[0]);
				if(Character.isDigit(first[0]) && Character.isDigit(first[1]) && Character.isDigit(first[2]) && Character.isDigit(first[3]))
				{
					
					count++;
					
					System.out.println(first[0]+""+first[1]+""+first[2]+""+first[3]);
					System.out.println(count);
				}
				if (count==4) 
				{
					System.out.println("hi");
				}
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for (int i = 0; i < sh.length; i++) 
//		{
//			int count=0;
//			char[] first = sh[i].toCharArray();
//			//System.out.println(first);
//			
//			for (char c : first) 
//			{
//				//System.out.println(c);
//				if(Character.isDigit(c));
//				count++;
//				
//				if(count==4)
//				{
//					System.out.println(first);
//				}
//			}
//			
//		}
	}
	
	@Test
	
	public void number()
	{
		String s="df/789/1234/df342/vcv55444/999/tht/77";
		String[] sh = s.split("/");
		System.out.println(sh.length);
		
		for (int i = 0; i < sh.length; i++) 
		{
			try {
				int no = Integer.parseInt(sh[i]);
				if(no>=1000 && no<=9999)
				{
					System.out.println(no);
				}
			}
				catch (Exception e) 
				{
					
				}
			}
			
		}
	

}
