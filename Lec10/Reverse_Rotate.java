package Lec10;

import java.util.Arrays;

public class Reverse_Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {1,2,3,4,5};
//		reverse(arr,2,5);
		rotateFast(arr,2);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void reverse(int[] arr,int si,int ei)
	{
//		int si = 0;
//		int ei = arr.length-1;
		
		while(si < ei)
		{
			int t = arr[si];
			arr[si] = arr[ei];
			arr[ei] = t;
			
			si += 1;
			ei -= 1;
		}
		
	}
	
	public static void rotate1(int[] arr)
	{
		int t = arr[arr.length-1];
		for(int i = arr.length-1; i >= 1; i--)
		{
			arr[i] = arr[i-1];
		}
		arr[0] = t;
	}
	public static void rotatek(int[] arr,int k)
	{
		k = k%arr.length;
		if(k < 0)
		{
			k += arr.length;
		}
		for(int i = 0; i < k; i++)
		{
			rotate1(arr);
		}
	}
	public static void rotateFast(int[] arr,int k)
	{
		k = k%arr.length;
		if(k < 0)
		{
			k += arr.length;
		}
		
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
	}

}
