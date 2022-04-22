package Lec6;

public class ArrayOPs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,-2,30,14,5};
		
		maxV(arr);
		System.out.println(search(arr, 140));

	}
	
	public static int maxV(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i:arr)
		{
			if(max < i)
			{
				max = i;
			}
		}
		System.out.println(max);
		return max;
	}
	
	public static int search(int[] arr,int ele)
	{
		int ind = 0;
		for(int i: arr)
		{
			if( i == ele)
			{
				return ind;
			}
			ind += 1;
		}
		return -1;
	}

}
