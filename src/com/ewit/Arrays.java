package com.ewit;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Sum of All Elements in an Array
Problem:
You have a list of numbers. Add all the numbers together and show the total.

Example:
If the array is {1, 2, 3}, the output should be 6.
		 int[] arr1= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=0;i<arr1.length;i+=2) {
			sum=sum+arr1[i];
		System.out.println("sum is:"+sum);
		}*/
		
		int[] arr2= {2,3,4,5,6,7};
		int max=arr2[0];
		int min=arr2[0];
		for(int i=1; i<arr2.length;i++) {
			if(arr2[i]>max) max=arr2[i];
			if(arr2[i]<min) min=arr2[i];}
		System.out.println("the max number is" +max);
		System.out.println("the min number is" +min);
				

	}

}
