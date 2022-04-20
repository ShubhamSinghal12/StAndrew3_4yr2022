package Lec4;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		byte b = 10;
		short s = 10;
		long l = 10;
		
		
//		byte b1 = (byte)l;
		
		short s1 = b;
		s1 = (short)i;
		
		i = b;
		i = s;
		i = (int)l;
		
		
		float f = 10.5f;
		f = i;
		f = l;
		
		l = (long)f;
		
		double d = 10.5;
		d = f;
		
		f = (float)d;
		
		char ch = 'a';
		i = ch;
		ch = (char)i;
		System.out.println(i);
		
		i = 100;
		String st = "Hello";
		st = st+i;
		System.out.println(2+3+st);
		

	}

}
