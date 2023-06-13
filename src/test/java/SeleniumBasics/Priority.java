package SeleniumBasics;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority 
{
	@Test(priority=1)
	
	public void priority()
	
	{
		String act="1";
		String expected="1";
		Reporter.log("hi1",true);
		Assert.assertEquals(act, expected);
		System.out.println("passed");
		
		
		
	}
	
	@Test(priority=2)
	
	public void priority2()
	
	{
		Reporter.log("hi2",true);
	}
	
	@Test(priority=0)
	
	public void priority0()
	
	{
		Reporter.log("hi0",true);
	}
	
	@Test(priority=-1,invocationCount=1)

	public void priority_1()

	{
		Reporter.log("hi_1",true);
		Assert.fail("fail");
	}
	
	@Test(enabled=true,priority=5,invocationCount=3,dependsOnMethods="priority_1")
	
	public void priority00()
	
	{
		Reporter.log("hi00",true);
		
	}
}
