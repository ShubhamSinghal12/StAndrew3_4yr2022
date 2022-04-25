package Lec7;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int mini(int[] arr,int i)
	{
		int min = i;
		for(int j = i+1; j < arr.length; j++)
		{
			if(arr[min] > arr[j])
			{
				min = j;
			}
		}
		return min;
	}
	public static void swap(int arr[], int a, int b)
	{
		int t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
	public static void selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length-1;i++)
		{
			int m = mini(arr, i);
			swap(arr, i, m);
		}
		
	}
	
	
	

}
