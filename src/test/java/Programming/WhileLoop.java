package Programming;

public class WhileLoop {
	
public static void main(String [] args) {
	
//	print 1 to 10
	int num=1;
	while(num<=10)
	{
		System.out.print(num+" ");
		num++;
	}
	
// print 10 to 1
	System.out.println("\n");
	int num2=10;
	while(num2>=1) {
		System.out.print(num2+" ");
		num2--;
	}
//	print 1 to 10 even number
	System.out.println("\n");
	int num3=1;
	while(num3<=10) {
		if(num3%2==0)
		{
			System.out.print(num3+" ");	
		}
		num3++;
	}
//	print 1 to 10 odd numbers
	System.out.println("\n");
	int num4=1;
	while(num4<=10) {
		if(num4%2!=0)
		{
			System.out.print(num4+" ");
		}
		num4++;
	}
	
	
	
	
}

}
