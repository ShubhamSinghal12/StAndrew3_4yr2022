package Lec25;

import java.util.ArrayList;

public class DiffWaysToaddPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(diff("2*3-4*5"));

	}
	
	public static int operation(int a,int b,char op)
	{
		if(op == '+')
		{
			return a+b;
		}
		else if(op == '*')
		{
			return a*b;
		}
		else
		{
			return a-b;
		}
	}

	public static boolean isOp(char ch)
	{
		return ch == '+' || ch == '*' || ch == '-' ;
	}
	
	public static ArrayList<Integer> diff(String st)
	{
		if(st.indexOf('+') == -1 && st.indexOf('-') == -1 && st.indexOf('*') == -1)
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			int x = Integer.parseInt(st);
			ans.add(x);
			return ans;
		}
		else
		{
			ArrayList<Integer> ans = new ArrayList<Integer>();
			for(int i = 0; i < st.length(); i++)
			{
				if(isOp(st.charAt(i)))
				{
					ArrayList<Integer> l = diff(st.substring(0,i));
					ArrayList<Integer> r = diff(st.substring(i+1));
					
					for(int k : l)
					{
						for(int j: r)
						{
							ans.add(operation(k, j, st.charAt(i)));
						}
					}
				}
			}
			return ans;
		}
	}
}
