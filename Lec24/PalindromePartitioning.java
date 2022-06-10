package Lec24;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PP("nitin","");

	}
	public static boolean isPalindrome(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si < ei)
		{
			if(st.charAt(ei) != st.charAt(si))
			{
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}
	
	public static void PP(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else {
			for(int i = 1;i <= ques.length();i++)
			{
				String p = ques.substring(0,i);
				if(isPalindrome(p))
				{
					PP(ques.substring(i),ans+p+" ");
				}
			}
		}
	}

}
