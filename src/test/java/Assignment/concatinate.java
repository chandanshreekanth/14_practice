package Assignment;

import java.util.Scanner;

public class concatinate {
	
	 static int x,y,sum;
		 // Declare x, y, and sum as static variables
	    
	    public static void main(String[] args) {
	        Scanner myObj = new Scanner(System.in);
	        System.out.println("Type a number:");
	        x = myObj.nextInt();

	        System.out.println("Type another number:");
	        y = myObj.nextInt();

	        sum = x + y;  
	        System.out.println("Sum is: " + sum); 
	    }
	

}
