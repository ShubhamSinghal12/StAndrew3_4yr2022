package Lec2;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 7;
//		int i = 1;
		int row  = 1;
		int nst = n;
		while (row <= n) {
//			Work
			
			int cst = 1;
		
			while (cst <= nst) {
				System.out.print("* ");
				cst += 1;
			}

//		Update
		row += 1;
		System.out.println();
		nst-=1;

	}
	}

}
