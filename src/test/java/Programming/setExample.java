package Programming;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class setExample 
{
	
	    public static void main(String[] args) {
	        // Creating a set using the HashSet class
	        Set set1 = new HashSet();

	        // Adding elements to set1
	        set1.add("a");
	        set1.add(2);
	        set1.add(3);
	        set1.add(5);

	        // Creating another set using the HashSet class
	        Set<Integer> set2 = new HashSet<>();

	        // Adding elements to set2
	        set2.add(3);
	        set2.add(6);
	        set2.add(8);

	        // Performing set operations
	        Set<Integer> unionSet = new HashSet<>(set1);
	        unionSet.addAll(set2);  // Union of set1 and set2

	        Set<Integer> intersectionSet = new HashSet<>(set1);
	        intersectionSet.retainAll(set2);  // Intersection of set1 and set2

	        Set<Integer> differenceSet = new HashSet<>(set1);
	        differenceSet.removeAll(set2);  // Difference between set1 and set2

	        // Printing the results
	        System.out.println("Set1: " + set1);
	        System.out.println("Set2: " + set2);
	        System.out.println("Union set: " + unionSet);
	        System.out.println("Intersection set: " + intersectionSet);
	        System.out.println("Difference set: " + differenceSet);
	        
	        LinkedHashSet<Integer> data = new LinkedHashSet<Integer>();   
	    }
	

}
