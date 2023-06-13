package CollectionExample;

import java.util.ArrayList;

public class List {

	
	public static void main(String args[]){  
		 //Creating a List  
		java.util.List l=new ArrayList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add('a');
		l.add("b");
		l.add(3);
		l.add("");
		l.add(3);
		
		
		//System.out.println(l.add(4));
		
		  System.out.println(l);
		  
		  l.remove(0);
		  l.remove(0);
		  System.out.println(l);
		}  


}
