package Lec22;

public class MappedSrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mps("123","");

	}
	public static void mps(String ques,String ans)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else
		{
			char ch = (char)(ques.charAt(0)-'1'+'A');
			mps(ques.substring(1),ans+ch);
			if(ques.length() >=2)
			{
				String s = ques.substring(0,2);
				int i = Integer.parseInt(s);
				ch = (char)(i-1+'A');
				if(i<=26)
				{
					mps(ques.substring(2),ans+ch);
				}
			}
		}
	}

}
