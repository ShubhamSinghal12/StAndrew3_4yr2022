package Lec15;

import java.util.Arrays;

public class FormBiggestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,98,6,68,60,54,548,546};
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static int compareTo(int a,int b)
	{
		int f = Integer.parseInt(String.valueOf(a)+String.valueOf(b));
		int s = Integer.parseInt(String.valueOf(b)+String.valueOf(a));
		return f-s;
	}
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0;i < arr.length-1; i++)
		{
			int s = 0;
			for(int j = 0; j < arr.length-1-i; j++)
			{
				if(compareTo(arr[j],arr[j+1]) < 0)
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
