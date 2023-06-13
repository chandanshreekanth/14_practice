package Programming;

public class Get1stMaxWithoutBubbleSort {

	public static void main(String[] args) 
	{
		int[] a= {30,40,10,20,50};
		
		int max=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		
		System.out.println(max);
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
//		int se = a.length-4;
//		System.out.println(a[se]);
	}

}
