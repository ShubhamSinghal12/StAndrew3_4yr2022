package Lec25;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mp(0, 0, 2, 3, "");

	}
	public static void mp(int cr,int cc,int m,int n,String ans)
	{
		if(cr == m && cc == n)
		{
			System.out.println(ans);
		}
		else if(cr >m || cc >n)
		{
			return;
		}
		else {
			mp(cr, cc+1, m, n, ans+"H");
			mp(cr+1, cc, m, n, ans+"V");
			mp(cr+1, cc+1, m, n, ans+"D");
			
		}
	}

}
