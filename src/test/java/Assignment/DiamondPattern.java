package Assignment;

import java.util.Iterator;

import org.testng.annotations.Test;

public class DiamondPattern {
	@Test

	public  void StartPatternFull()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=5; j++) 
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();

		}
		
	}

	
	@Test
	
	public void RightAngle()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++) 
			{
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}
	
@Test
	
	public void RightAngleInverted()
	{
		for (int i = 5; i>=1;i--) 
		{
			for (int j = i; j >=1; j--) 
			{
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}


	@Test

	public void RightAngleNumberTriangle()
	{
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 1; j <=i; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 

}
