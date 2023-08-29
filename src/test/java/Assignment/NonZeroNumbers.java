package Assignment;

import java.util.ArrayList;

public class NonZeroNumbers {

	public static void main(String[] args) 
	{
		int a[]= {0,1,1,1,3,3,0,0,0,};
		
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				al1.add(a[i]);
			}
			
			else
			{
				al2.add(a[i]);
			}
		}
		System.out.println(al1+" "+al2);
		//System.out.println(al2);
		
//		for (int i = 0; i < al2.size(); i++) 
//		{
//			al1.add(al2.get(i));
//		}
//		
//		System.out.println(al1);
		
		al1.addAll(al2);
		System.out.println(al1);
	}

}
