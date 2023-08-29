package Assignment;

public class PrintConsonants 
{
	public static void main(String[] args) 
	{
		String ab="";
		String con="";
		for (char i = 'a'; i <= 'z'; i++) 
		
		{
			if(i!='a'&&i!='e'&&i!='i'&&i!='o'&&i!='u')
			{
				 con = ab+i;
				System.out.print(con);
			}
			
		}
	}
}
