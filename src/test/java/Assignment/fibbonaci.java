package Assignment;

import java.util.ArrayList;
import java.util.List;

public class fibbonaci {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		List lst = new ArrayList<>();
		int temp =0;
		int carry =0;
		for (int i = a.length -1; i >= 0; i--) {
			
			if(carry>0) {
				a[i] = a[i]+carry;
			}
			temp = a[i]+b[i];
			if(temp>9) 
			{
				lst.add(temp%10);
				carry = temp/10;
			}else 
			{
				lst.add(temp);
				carry = 0;
			}
		}
		
		for (int i = lst.size() -1 ; i >=0; i--) {
			System.out.print(lst.get(i));
		}

	}

}
