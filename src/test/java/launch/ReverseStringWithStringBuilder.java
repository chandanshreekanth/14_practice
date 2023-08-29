package launch;

import org.testng.annotations.Test;

public class ReverseStringWithStringBuilder {
	@Test

	public void reverseStringWithStringBuilder()
	{
		String s="james and chan";
		
		StringBuilder str=new StringBuilder(s);
		str.reverse();
		System.out.println(str);
		System.out.println(str.hashCode());
		System.out.println(str.append("abc").hashCode());
		
	}
	
	@Test

	public void reverseStringWithStringBuffer()
	{
		String s="james and chan";
		System.out.println(s.hashCode());
		String c = s+"b";
		System.out.println(c.hashCode());
		String d;
		System.out.println((d=c+"c").hashCode());
		
		StringBuffer str=new StringBuffer(s);
		str.reverse();
		System.out.println(str);
		System.out.println(str.hashCode());
		StringBuffer b = str.append("a");
		System.out.println(b);
		System.out.println(b.hashCode());
	}
	

}
