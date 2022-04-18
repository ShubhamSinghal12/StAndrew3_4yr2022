package Lec4;

public class AnyToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 71;
		
		int ans = 0;
		int multi = 1;
		int base = 8;
		while(n!=0)
		{
			int rem = n%10;
			ans += rem*multi;
			
			n /= 10;
			multi *= base;
		}
		System.out.println(ans);

	}

}
