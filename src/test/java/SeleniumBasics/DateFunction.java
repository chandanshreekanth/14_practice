package SeleniumBasics;

import java.util.Date;

public class DateFunction 
{
	public static void main(String[] args)
	{
		Date date=new Date();
		System.out.println(date);
		String d = date.toString();
		String da = d.replace(" ", "/");
		System.out.println(da);
		 String daa = da.substring(11, 19);
		System.out.println(daa);
	}
}
