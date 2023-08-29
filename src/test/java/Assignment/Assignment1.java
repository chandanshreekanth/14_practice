package Assignment;

public class Assignment1 {

	public static void main(String[] args) 
	{
		String ab = "";
		String s="1234/FDGGDG$%&/JBDJ636/7778/jdjc$%^";
	
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)=='7'&& s.charAt(i+1)=='7'&& s.charAt(i+2)=='7'&&s.charAt(i+3)=='7')
			{
				for(int  j= 0; j < 4; j++)
				{
					System.out.print(s.charAt(i));
				}
				
				
				
			}
		}
		
		System.out.print(ab);

	}

}
