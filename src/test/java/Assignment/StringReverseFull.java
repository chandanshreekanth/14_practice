package Assignment;

public class StringReverseFull {

	public static void main(String[] args) 
	{
		String s="Welcome to Testyantra";
		
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) 
		{
			 String str = s1[i];
			 String rev="";
				
				for (int i1 = str.length()-1; i1>=0; i1--) 
				{
					
					rev=rev+str.charAt(i1);
					
				}
				
				System.out.print(rev +" ");
		}
		
		//System.out.println(" ");
		
	
	}

}
