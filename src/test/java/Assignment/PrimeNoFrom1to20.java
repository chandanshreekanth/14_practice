package Assignment;

public class PrimeNoFrom1to20 {

	public static void main(String[] args) 
	{
		
		int a[]={2,3,5,7,9,11,15,19,-56};
		for (int i = 0; i < a.length; i++) 
		{
			int n=a[i];
			 boolean flag = true;
			if(n<=1)
			{
				flag=false;
			}
			for (int i1 = 2; i1 < n; i1++) 
			{
				if(n%i1==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(n+" is prime number ");
			}
			
			else 
			{
				System.out.println(n+" is not prime number ");
			}
			
		}
		
		
	}
}
