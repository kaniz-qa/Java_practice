package com.java.array;

import java.util.Arrays;
import java.util.Collections;

public class Animals {



  
	 public static void main(String args[]){  
		 Animals s=new Animals();  
	 System.out.println(s instanceof Animals);//true  
	 
	 
	 
	 int[] arr = new int[2];
	 int[] arr2 = {2,5,7,4,10,3};
	//System.out.println(arr2.length);
	Arrays.sort(arr2);
	System.out.println(Arrays.toString(arr2));
	
	
	 arr[0] = 5;
	 arr[1] = 12;
	 System.out.println(Arrays.toString(arr));
	 
	 
	//----------------duplicate----------------
	 
	 
	 int[] my_array = {1, 2, 5, 5, 6, 6, 7, 2};
	 
     for (int i = 0; i < my_array.length-1; i++)
     {
         for (int j = i+1; j < my_array.length; j++)
         {
             if ((my_array[i] == my_array[j]) && (i != j))
             {
                 System.out.println("Duplicate Element : "+my_array[i]);
             }
         }
	 
	 
	 //--------duplicate another one -------------
        
	 }  
	 }
}
