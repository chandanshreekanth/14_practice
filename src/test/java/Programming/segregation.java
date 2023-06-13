package Programming;

public class segregation {

	public static void main(String[] args) 
	{
		// i/p= "a1b2c3x4y5z"
		//o/p = abcxyz 12345
		String character="";
		String number ="";
			
		String s="a1b2c3x4yz";
		
		for(int i=0;i<s.length();i++)
		{
			if(i%2==0)
			{
				character=character+s.charAt(i);
				
			}
			
			if(i%2==1) 
			{
				number=number+s.charAt(i);
			}
		}
		System.out.println(character);
		System.out.println(number);
	}

}
