package myworkspace;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sorting {
	
	static void bubbleSort(int arr[] , int n)
	{
		if(n==1)
			return ;
		
		for(int i =0 ; i<n-1 ; i++)
		{
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		bubbleSort(arr,n-1);
	}
	
	public static void main(String[] args) {
		
		int arry[] = {38,99,1,5,17,101,65};
		
		bubbleSort(arry,arry.length);
		
		for(int num : arry)
		{
			System.out.println(num);
		}
		
		
		
		
	}

}
