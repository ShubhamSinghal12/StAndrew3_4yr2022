package Lec7;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,4,5,1};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0;i < arr.length-1; i++)
		{
			int s = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					s += 1;
					int t = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = t;
				}
			}
			if(s == 0)
				break;
		}
	}

}
