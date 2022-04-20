package Lec5;

public class Swap {
	
	public static int d = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int a = 10;
		int b = 20;
		System.out.println(a+" "+b);
		swap(a,b);
		System.out.println(a+" "+b);
		System.out.println(d);

	}
	
	public static void swap(int a,int b)
	{
		int d = a;
		a = b;
		b = d;
		System.out.println("D= "+Swap.d);
	}

}
