package Lec11;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,1,2,2,2,3,3,4,5,5,6,7));
		ArrayList<Integer> br = new ArrayList<Integer>(Arrays.asList(1,2,2,2,2,4,7,8,8,9));

		ArrayList<Integer> ans = new ArrayList<Integer>();
		
		int i = 0;
		int j = 0;
		
		while(i < ar.size() && j < br.size())
		{
			int a = ar.get(i);
			int b = br.get(j);
			if(a == b)
			{
				ans.add(ar.get(i));
				i++;
				j++;
			}
			else if (a > b)
			{
				j++;
			}
			else {
				i++;
			}
		}
		System.out.println(ans);
	}

}
