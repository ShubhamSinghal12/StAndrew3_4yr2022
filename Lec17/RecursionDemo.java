package Lec17;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PDI(5);

	}
	
	public static void PD(int n)
	{
		if(n==1)
		{
			System.out.println(1);
		}
		else {
			System.out.println(n);
			PD(n-1);
		}
	}
	public static void PI(int n)
	{
		if(n==1)
		{
			System.out.println(1);
		}
		else
		{
			PI(n-1);
			System.out.println(n);
		}
	}
	
	public static void PDI(int n)
	{
		if(n==1)
		{
			System.out.println(1);
		}
		else {
			System.out.println(n);
			PDI(n-1);
			System.out.println(n);
		}
	}

}
