package Lec21;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stairsComb(5, "",1);
//		stairs2(5, 0, "");

	}
	public static void stairs(int n,String ans)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n < 0)
		{
			return;
		}
		else {
			stairs(n-1, ans+"1");
			stairs(n-2, ans+"2");
		}
	}
	public static void stairsComb(int n,String ans,int lc)
	{
		if(n == 0)
		{
			System.out.println(ans);
		}
		else if(n < 0)
		{
			return;
		}
		else {
			if(lc <=1)
				stairsComb(n-1, ans+"1",1);
			
			stairsComb(n-2, ans+"2",2);
		}
	}
	public static void stairs2(int n,int i,String ans)
	{
		if(n == i)
		{
			System.out.println(ans);
		}
		else if(i > n)
		{
			return;
		}
		else {
			stairs2(n,i+1, ans+"1");
			stairs2(n,i+2, ans+"2");
		}
	}

}
