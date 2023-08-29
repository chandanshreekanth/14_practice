package launch;

import java.util.Scanner;

public class PrimeNumber1to100 
{
	public static void main(String[] args) 
	{
	/*	Scanner sc=new Scanner(System.in);
		int no = sc.nextInt();
		*/		
		for (int i = 0; i < 100; i++) 
		{
			int no=i;
			boolean flag = true;
			if(no<=1)
			{
				flag=false;
			}
			
			for(int i1=2;i1<no;i1++)
			{
				if(no%i1==0)
				{
					flag=false;
					break;
					
				}
			}
			if(flag)
			{
				System.out.println("prime no "+i);
			}
			else
			{
				System.out.println("not prime no "+i);
			}
			
		}
		
	}
}
/*if(no<=1)
{
	flag=false;
}*/