package Lec4;

public class DecimalToAny {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 57;
		
		int ans = 0;
		int multi = 1;
		int base = 8;
		while(n!=0)
		{
			int rem = n%base;
			ans += rem*multi;
			
			n /= base;
			multi *= 10;
		}
		System.out.println(ans);

	}

}
