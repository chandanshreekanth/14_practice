package Programming;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) 
	{
	   Scanner scan=new Scanner(System.in);
	   int no = scan.nextInt();
	   scan.close();
		//int no=999;
	   int sum=0;
	   
	   while(no>0)
	   {
		   sum=sum+no%10;
		   no=no/10;
	   }
	   
	  // System.out.println(sum+"hii");
	   
	   while(sum>9)
	   {
		   int n = sum;
		   sum=0;
		   while(n>0)
		   {
			   sum=sum+n%10;
			   n=n/10;
		   }
		   System.out.println(sum+"=single digit");
		  // break;
	   }
	   
	   
	}

}
