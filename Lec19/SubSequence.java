package Lec19;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(ss("abc"));
//		Asciiss("abc","");
		System.out.println(countss2("abcd", ""));

	}
	
	public static ArrayList<String> ss(String s){
		if(s.length() == 0)
		{
			return new ArrayList<String>(Arrays.asList(""));
		}
		else
		{
			ArrayList<String> rr = ss(s.substring(1));
			char ch = s.charAt(0);
			ArrayList<String> ans = new ArrayList<String>();
			for(String val: rr)
			{
				ans.add(val);
				ans.add(ch+val);
			}
			return ans;
		}
	}
	public static void ss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			ss2(ques.substring(1), ans);
			ss2(ques.substring(1), ans+ques.charAt(0));
		}
	}
	public static int countss2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
			return 1;
		}
		else
		{
			int c = 0;
			c += countss2(ques.substring(1), ans);
			c += countss2(ques.substring(1), ans+ques.charAt(0));
			return c;
		}
	}
	public static void Asciiss(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			Asciiss(ques.substring(1), ans);
			Asciiss(ques.substring(1), ans+ques.charAt(0));
			Asciiss(ques.substring(1), ans+(int)ques.charAt(0));
		}
	}

}
