
//Print all pairs with given sum

package com.java.array;

public class ArrayPairSum {

	static void printPairs(int arr[], 
            int n, int sum) 
		{ 

			for (int i = 0; i < n; i++) 
				for (int j = i + 1; j < n; j++) 
					if (arr[i] + arr[j] == sum) 
						System.out.println("(" + arr[i] + ", " + arr[j] + ") = "+sum); 
		} 
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3};
		
		 //int arr[] = { 1, 5, 7, -1, 5 }; 
	        int n = arr.length; 
	        int sum = 8; 
	        printPairs(arr, n, sum); 

	}

}
