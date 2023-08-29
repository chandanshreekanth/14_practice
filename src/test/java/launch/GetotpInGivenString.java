package launch;

import org.testng.annotations.Test;

public class GetotpInGivenString {

	public static void main(String[] args) 
	{
		String s="bjhk/bhehbt6633/7373/199664/87hjj";
		char[] a = s.toCharArray();
		for (int i = 0; i <a.length; i++) 
		{
			if(a[i]=='/' && a[i+1]>='0'&& a[i+1]<='9' && a[i+2]>='0' && a[i+2]<='9' && a[i+3]>='0' && a[i+3]<='9' && a[i+4]>='0' && a[i+4]<='9' && a[i+5]=='/')
			{
				System.out.println(a[i+1]+" "+a[i+2]+" "+a[i+3]+" "+a[i+4]);
				
			}
		}
	}
@Test
	
	public void number()
	{
		String s="df/789/1234/df342/vcv55444/44444/tht/77/6545/9999";
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
