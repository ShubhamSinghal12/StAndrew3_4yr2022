package Lec9;

public class SubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-1,-2,-3,-4,-5,-6,-10,-5,-2};
		kadanes(arr);

	}
	
	public static void printS(int[] arr) {
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				for(int k = i; k <= j; k++)
				{
					System.out.print(arr[k]);
				}
				System.out.println();
			}
		}
	}
	public static void SumS(int[] arr) {
		
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i; j < arr.length; j++)
			{
				int sum = 0;
				for(int k = i; k <= j; k++)
				{
//					System.out.print(arr[k]);
					sum += arr[k];
				}
				System.out.println(sum);
			}
		}
	}
	
	public static void SumS1(int[] arr) {
		
		for(int i = 0; i< arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				System.out.println(sum);
			}
		}
	}
	
	public static void MaxSumS(int[] arr) {
		
		int maxS = Integer.MIN_VALUE; 
		for(int i = 0; i< arr.length; i++)
		{
			int sum = 0;
			for(int j = i; j < arr.length; j++)
			{
				sum += arr[j];
				if(maxS < sum)
					maxS = sum;
//				System.out.println(sum);
			}
		}
		System.out.println(maxS);
	}
	public static void kadanes(int[] arr)
	{
		int maxs = Integer.MIN_VALUE;
		int sum = 0;
		for(int i = 0;i < arr.length; i++)
		{
			sum += arr[i];
			if(sum > maxs)
			{
				maxs = sum;
			}
			if(sum < 0)
			{
				sum = 0;
			}
		}
		System.out.println(maxs);
	}

}
