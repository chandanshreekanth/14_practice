package Programming;

public class Get1stMinWithoutBubbleSort 
{
	public static void main(String[] args) 
	{
		int[] a= {30,40,10,20,50};
		
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		
		System.out.println(min);
		
	}
}
