package Programming;

public class Hi {

	public static void main(String[] args) 
	{
			String s="Chandan123@#$";
			//System.out.println(s);
			for (int j = 0; j < s.length(); j++) 
			{
				if(Character.isAlphabetic(s.charAt(j)))
				{
					System.out.print(s.charAt(j));
				}
			}
			
//			String ab="abcd123@#%^aABCD";
//			for(int i = 0 ; i < ab.length() ; i++)
//			{
//				if(Character.isLowerCase(ab.charAt(i)))
//				{
//					System.out.print(ab.charAt(i));
//				}}
			
	}

}
