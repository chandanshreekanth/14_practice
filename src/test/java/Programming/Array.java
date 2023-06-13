package Programming;

public class Array {
	
	public static void main(String [] args) {
//	print array	
		int arr[]= {1,2,3,4,5,6,7,8};
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
//print array in reverse order
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		System.out.println();
// print even numbers in given array
		for(int i=0; i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
// print odd numb<ers in a given array
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==1) {
			System.out.print(arr[i]+" ");
		}
	}
		

		
	}

}
