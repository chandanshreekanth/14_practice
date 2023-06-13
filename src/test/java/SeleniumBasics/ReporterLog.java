package SeleniumBasics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog 
{
	@Test
	
	public void reporterLog1()
	{
		Reporter.log("hi1");
	}
	
	@Test
	public void reporterLog2()
	{
		Reporter.log("hi2",true);
	}
	
	@Test
	public void reporterLog3()
	{
		Reporter.log("hi3",false);
	}
}
