package Lec18;

public class RecursionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibTail(7,0,1));

	}
	public static int fact(int n) {
		if(n==0)
		{
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}
	public static int factTail(int n,int ans)
	{
		if(n==0)
		{
			return ans;
		}
		else {
			return factTail(n-1, ans*n);
		}
	}
	public static int power(int a,int b)
	{
		if(b == 0)
		{
			return 1;
		}
		else
		{
			return power(a, b-1)*a;
		}
	}
	
	public static int powerTail(int a,int b,int ans)
	{
		if(b == 0)
		{
			return ans;
		}
		else
		{
			return powerTail(a, b-1, ans*a);
		}
	}
	public static int fib(int n)
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		else {
			return fib(n-1)+fib(n-2);
		}
	}

	public static int fibTail(int n,int a,int b)
	{
		if(n == 0)
		{
			return a;
		}
		else {
			System.out.println(a);
			return fibTail(n-1, b, a+b);
		}
	}
}
