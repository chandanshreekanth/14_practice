package CollectionExample;

public class StringReverse 
{
	public static void main(String[] args) 
	{
		String s="My name is chandan";
		 String s1 = s.replace("a", "");
		 System.out.println(s1);
		 
		String[] s2 = s1.split(" ");
		 String rev="";
		 
		 for (int i = 0; i < s2.length; i++) 
		{
			String s3 = s2[i];
			
			 for (int i1 = s3.length()-1; i1 >=0; i1--) 
				{
					rev=rev+s3.charAt(i1);
					
				}
			 rev=rev+" ";
		}
		
		 System.out.println(rev);
		
	}
}
