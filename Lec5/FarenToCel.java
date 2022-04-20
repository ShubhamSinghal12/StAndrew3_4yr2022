package Lec5;

public class FarenToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int minf = 0;
		int maxf = 100;
		int step = 20;
		
		for(int f = minf; f<= maxf; f+=step)
		{
			int c = (int)((5.0/9)*(f-32));
			System.out.println(c);
		}
		

	}
	

}
