package Assignment;

public class AddingFirst3MaxNum {

	public static void main(String[] args) 
	{	
		
		int a[]= {10,40,50,30,20};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int b=0;
		for (int i = 0; i < 1; i++) 
		{
			 b = (a[i]+a[i+1]+a[i+2]);
			
		}
		System.out.println(b);
	}

}
