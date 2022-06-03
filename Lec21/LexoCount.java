package Lec21;

public class LexoCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i = 1; i <= 9; i++)
//			lexo(100, i);
		lexo(100,0);

	}
	
	public static void lexo(int m,int n)
	{
		if(n>m)
		{
			return;
		}
		else {
			System.out.println(n);
			int i = 0;
			if(n == 0)
			{
				i = 1;
			}
			for(; i<= 9; i++)
			{
				lexo(m, n*10+i);
			}
			
		}
	}

}
