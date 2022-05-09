package Lec13;

public class SortedSearch {

	public static void main(String[] args) {
		int[][] arr = {{1,3,8,9},{2,7,9,10},{11,13,15,17},{14,16,18,20}};
		System.out.println(search(arr, 12));
	}
	
	public static boolean search(int[][] arr,int ele)
	{
		int i = 0;
		int j = arr[0].length-1;
		
		while(i < arr.length && j >= 0)
		{
			if(arr[i][j] == ele)
			{
				return true;
			}
			else if(arr[i][j] < ele)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		return false;
	}
}
