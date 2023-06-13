package Sudhakar;

import java.util.Random;

public class BreakContinue {

	public static void main(String[] args) 
	{
		
		for (int i = 0; i < 10; i++) 
		{
			System.out.println(i);
			if(i==3)
			{
				break;
			}
		}
		
		Random ran=new Random();
		int r = ran.nextInt(4);
		System.out.println(r);
		
	}

}
