package Lec23;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tpm("abaa","");

	}
	
	public static void pm(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i <= ans.length();i++)
			{
				String na = ans.substring(0,i) + ques.charAt(0)+ans.substring(i);
				pm(ques.substring(1),na);
			}
		}
	}
	
	public static void pm2(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length();i++)
			{
				String nq = ques.substring(0,i) + ques.substring(i+1);
				pm2(nq,ans+ques.charAt(i));
			}
		}
	}
	
	public static void tpm(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			for(int i = 0; i < ques.length();i++)
			{
				if(ques.indexOf(ques.charAt(i)) == i)
				{
					String nq = ques.substring(0,i) + ques.substring(i+1);
					tpm(nq,ans+ques.charAt(i));
				}
			}
		}
	}

}
