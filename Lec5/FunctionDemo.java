package Lec5;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hi");
		int c = add(10,20);
		System.out.println(c);
		System.out.println("Bye");

	}
	
	public static int add(int a,int b)
	{
		
		int c = a+b;
//		sub(a,b);
		
//		System.out.println(c);
		return c;
	}
	
	public static void sub(int a,int b)
	{
		int c = a-b;
		System.out.println(c);;
	}

}
