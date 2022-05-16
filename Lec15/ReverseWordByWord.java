package Lec15;



public class ReverseWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The sky is Blue";
//		String st = "";
//		int i = s.lastIndexOf(' ');
//		while(i != -1)
//		{
//			st += s.substring(i+1)+" ";
//			s = s.substring(0,i);
//			
//			i = s.lastIndexOf(' ');
//		}
//		st += s;
//		System.out.println(st);
		
		String[] st = s.split(" ");
		String ans = "";
		for(int i= st.length-1; i>=0;i--)
			ans += st[i]+" ";
		System.out.println(ans);
		int i = Integer.parseInt("1234");
		System.out.println(i);
		

	}

}
