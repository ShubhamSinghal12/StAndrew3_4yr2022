package Lec13;

public class Spiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		sp(arr);

	}
	
	public static void sp(int[][] arr)
	{
		int minr = 0;
		int maxr = arr.length-1;
		int minc = 0;
		int maxc = arr[0].length-1;
		
		int te = arr.length*arr[0].length;
		int ce = 0;
		
		
		while(te > ce)
		{
			for(int i = minc; i <= maxc && te >ce; i++)
			{
				System.out.print(arr[minr][i]+" ");
				ce++;
			}
			minr ++;
			
			for(int i = minr; i<= maxr && te >ce; i++)
			{
				System.out.print(arr[i][maxc]+" ");
				ce++;
			}
			maxc--;
			
			
			for(int i = maxc; i >= minc && te >ce; i--)
			{
				System.out.print(arr[maxr][i]+" ");
				ce ++;
			}
			maxr --;
			
			for(int i = maxr; i >= minr && te >ce; i--)
			{
				System.out.print(arr[i][minc]+" ");
				ce++;
			}
			
			minc++;
			
		}
	}

}
