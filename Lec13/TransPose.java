package Lec13;

import java.util.Arrays;

public class TransPose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr);
		for(int[] i:arr)
			System.out.println(Arrays.toString(i));
			
		

	}
	
	public static void transpose(int[][] arr)
	{
		for(int i = 0; i < arr.length-1;i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				int t = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = t;
			}
		}
	}

}
