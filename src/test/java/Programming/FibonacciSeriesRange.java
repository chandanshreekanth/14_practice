package Programming;

public class FibonacciSeriesRange 
{
	public static void main(String[] args) 
	{
		int f1=0;
		int f2=1;
		int f3=0;
		
		System.out.print(f1+" ");
		
		for (int i = 0; i < 50; i++) 
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			if(f3<50)
			{
				System.out.print(" "+f3);
			}
			else 
			{
				break;
			}
		}
	
	}
}
