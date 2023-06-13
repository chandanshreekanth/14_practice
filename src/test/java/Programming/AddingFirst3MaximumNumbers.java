package Programming;

public class AddingFirst3MaximumNumbers {

	public static void main(String[] args) 
	{
		int a[]= {10,40,50,30,20,100,200,300};
		
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
		
		for (int k = 0; k<1; k++) 
		{
			System.out.println(a[k]+a[k+1]+a[k+2]);
		}
		
		
		
//		int sum=0;
//		for(int i=0;i<3;i++)
//		{
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
	}

}
