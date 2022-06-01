package Lec20;

public class KeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kmap = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		keyPad("23", "", kmap);

	}
	public static void keyPad(String ques,String ans,String[] kmap)
	{
		if(ques.length() == 0)
		{
			System.out.println(ans);
		}
		else {
			String st = kmap[ques.charAt(0)-'0'];
			for(int i = 0; i < st.length(); i++)
			{
				keyPad(ques.substring(1), ans+st.charAt(i), kmap);
			}
		}
	}

}
