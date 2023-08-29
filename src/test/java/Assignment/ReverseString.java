package Assignment;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s="chandan";
		
		int count=0;
		
		char[] a = s.toCharArray();
		
		for (char c : a) 
		{
			count++;
		}
		System.out.println(count);
		
		for (int i=count-1;i>=0;i--) 
		{
			System.out.print(s.charAt(i));
		}
	}

}
