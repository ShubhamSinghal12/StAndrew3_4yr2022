package Lec7;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,4,5,0,12,4,65,123,45};
		insertionSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void insert(int[] arr,int j)
	{
		int t = arr[j];
		boolean flag = true;
		for(int i = j-1; i >= 0; i--)
		{
			if(arr[i] > t)
			{
				arr[i+1] = arr[i];
			}
			else {
				flag = false;
				arr[i+1] = t;
				break;
			}
		}
		if(flag)
			arr[0] = t;
	}
	
	public static void insertionSort(int[] arr)
	{
		for(int j = 1; j < arr.length; j++)
		{
//			insert(arr, i);
			int t = arr[j];
//			boolean flag = true;
			int i = j-1;
			while( i >= 0)
			{
				if(arr[i] > t)
				{
					arr[i+1] = arr[i];
				}
				else {
					break;
				}
				
				i--;
			}
			arr[i+1] = t;
		}
	}

}
