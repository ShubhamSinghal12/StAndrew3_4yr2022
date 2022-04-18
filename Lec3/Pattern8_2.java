package Lec3;

public class Pattern8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		
		int nst = n;
		int row = 1;
		
		while(row <= n)
		{
			int cst = 1;
			while(cst <= nst)
			{
				if(cst == row || cst+row == n+1)
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				cst += 1;
			}
			
			row += 1;
			System.out.println();
		}

	}

}
