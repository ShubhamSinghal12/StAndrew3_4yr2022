package Lec6;

import java.util.Scanner;

public class ArraysDemo {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr;
		arr = new int[5];
		System.out.println(arr);
		arr[2] = 10;
		System.out.println(arr[2]);
		
		int brr[] = new int[5];
		
		System.out.println(brr);
		
		brr = arr;
		
		brr[2] = 100;
		System.out.println(arr[2]);
		System.out.println(arr.length);
		
		arr = takeInput(5);
		display(arr);
		
//		int[] crr = {1,2,3,4,5};
		int[] crr;
		
		crr = new int[]{1,2,3,4,5};
		
		
	}
	
	public static int[] takeInput(int n)
	{
		int[] arr = new int[n];
		for(int i = 0 ;i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	public static void display(int[] arr)
	{
//		for(int i = 0;i < arr.length; i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		for(int i : arr)
		{
			System.out.println(i);
		}
	}

}
