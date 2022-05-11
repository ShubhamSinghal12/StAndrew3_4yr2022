package Lec14;

public class SubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "nitinn";
//		SS(s);
//		System.out.println(isPalindrome2(s));
		System.out.println(countPalindromicSS(s));

	}
	
	public static void SS(String s)
	{
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				System.out.println(s.substring(i,j+1));
			}
		}
	}
	public static String reverse(String st)
	{
		String ans = "";
		for(int i = st.length()-1; i >= 0; i--)
			ans += st.charAt(i);
		
		return ans;
		
	}
	public static boolean isPalindrome(String st)
	{
		return st.equals(reverse(st));
	}
	public static boolean isPalindrome2(String st)
	{
		int si = 0;
		int ei = st.length()-1;
		while(si<ei)
		{
			if(st.charAt(si)!=st.charAt(ei))
			{
				return false;
			}
			si++;
			ei--;
		}
		return true;
	}
	
	public static int countPalindromicSS(String s)
	{
		int count = 0;
		
		for(int i = 0; i < s.length(); i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				if(isPalindrome2(s.substring(i,j+1)))
				{
					count += 1;
				}
			}
		}
		return count;
	}
	 

}
