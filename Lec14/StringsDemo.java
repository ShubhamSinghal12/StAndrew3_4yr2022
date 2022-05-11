package Lec14;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = "Hello";
//		System.out.println(s);
////		System.out.println(s.charAt(s.length()-1));
//		System.out.println(s.substring(1,4));
////		System.out.println(s.indexOf('l'));
//		System.out.println(s.indexOf("elo"));
//		System.out.println(s.lastIndexOf('l'));
//		
//		System.out.println(s.startsWith("he"));
//		System.out.println(s.endsWith("lo"));
//		System.out.println(s.concat("abc"));
//		String s2 = "abc";
//		String s3 = s+s2;
//		System.out.println(s3);
//		System.out.println(s.replace("ll", "r"));
//		
//		
		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000;i++)
		{
			s += "a";
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start));
		
		

	}

}
