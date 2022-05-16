package Lec15;

public class StringBuilderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("Hello");
//		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb1 = sb;
		System.out.println(sb == sb1);
		String s = sb.substring(0,3);
		System.out.println(s);
//		sb.append(" hi");
//		sb.append(false);
//		sb.insert(2, " XYZ ");
		sb.setCharAt(2, 'a');
//		sb.deleteCharAt(0);
		sb.delete(0, 3);
		System.out.println(sb);
		System.out.println(sb1);
		String s1 = sb1.toString();
		sb1 = new StringBuilder(s);
//		String s = "";
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000;i++)
		{
			sb.append("a");
		}
		long end = System.currentTimeMillis();
		System.out.println((end-start));

	}

}
