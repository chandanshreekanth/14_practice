package launch;

public class MinLengthInString {

	public static void main(String[] args) 
	{
		
		String a[]= {"ab","abc","cd","abcd"};
		String minLen = a[0];
		
		for (int i = 0; i < a.length; i++) 
		{
			if(minLen.length()>=a[i].length())
			{
				minLen=a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if(minLen.length()==a[i].length())
			{
				System.out.println(a[i]);
			}
		}
		
	}

}
