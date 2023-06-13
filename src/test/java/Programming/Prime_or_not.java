package Programming;

import java.util.Scanner;

public class Prime_or_not {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number:");
	int no=sc.nextInt();
	boolean flag=true;
	for(int i=2;i<no;i++){
		if(no%i==0)
		{
			flag=false;
			break;
		}
	}
	if(flag==true)
	{
		System.out.println("Prime");
	}
	else {
		System.out.println("Not a prime");
	}
}
}
