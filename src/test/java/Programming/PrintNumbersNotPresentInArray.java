package Programming;

import java.util.HashSet;
import java.util.Set;

public class PrintNumbersNotPresentInArray {

	public static void main(String[] args) 
	{
		

		
		        int a[] = {1, 2, 3, 4};
		        int b[] = {1, 3, 5};

		        // Create sets to store unique elements from the arrays
		        Set<Integer> setA = new HashSet<>();
		        Set<Integer> setB = new HashSet<>();

		        // Add elements of array a to setA
		        for (int num : a) {
		            setA.add(num);
		        }

		        // Add elements of array b to setB
		        for (int num : b) {
		            setB.add(num);
		        }

		        // Create sets to store the not common elements
		        Set<Integer> notCommonElementsA = new HashSet<>(setA);
		        Set<Integer> notCommonElementsB = new HashSet<>(setB);

		        // Remove common elements from the sets
		        notCommonElementsA.removeAll(setB);
		        notCommonElementsB.removeAll(setA);

		        // Combine both sets of not common elements
		        Set<Integer> notCommonElements = new HashSet<>(notCommonElementsA);
		        notCommonElements.addAll(notCommonElementsB);

		        // Convert the not common elements set to an array for output
		        int[] outputArray = new int[notCommonElements.size()];
		        int index = 0;
		        for (int num : notCommonElements) {
		            outputArray[index++] = num;
		        }

		        // Output the not common elements
		        System.out.print("Output = ");
		        for (int i = 0; i < outputArray.length; i++) {
		            System.out.print(outputArray[i]);
		            if (i < outputArray.length - 1) {
		                System.out.print(",");
		            }
		        }
		    }
}
