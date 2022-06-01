package Lec20;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = ct(3, "");
		System.out.println(c);

	}
	public static int ct(int n,String ans)
	{
		if(n==0)
		{
			System.out.println(ans);
			return 1;
		}
		else {
			int c = 0;
			c += ct(n-1, ans+"H");
			c += ct(n-1,ans+"T");
			return c;
		}
	}

}
