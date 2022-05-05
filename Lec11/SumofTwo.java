package Lec11;

import java.util.ArrayList;
import java.util.Collections;

public class SumofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,9};
		int[] brr = {9,9,5,6,7};
		
		int i = arr.length-1;
		int j = brr.length-1;
		
		int c = 0;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		while(i >= 0 || j >= 0)
		{
			int sum = c;
			if(i >= 0)
			{
				sum += arr[i];
				i--;
			}
			if(j>=0)
			{
				sum += brr[j];
				j--;
			}
			
			ans.add(0,sum%10);
			c = sum/10;
		}
		if(c!=0)
		{
			ans.add(0,c);
		}
//		Collections.reverse(ans);
		System.out.println(ans);

	}

}
