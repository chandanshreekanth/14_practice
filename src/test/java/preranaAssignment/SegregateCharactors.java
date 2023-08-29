package preranaAssignment;

public class SegregateCharactors {

	public static void main(String[] args) 
	{
		String s = "chan1234dan#$%";
		
		String alphabet="";
		String num="";
		String spl="";
		
		for (int i = 0; i < s.length(); i++) 
		{
			if(s.charAt(i)>='a'&&s.charAt(i)<='z')
			{
				alphabet= alphabet+s.charAt(i);
			}
		}
		
		System.out.println(alphabet);
	}

}
