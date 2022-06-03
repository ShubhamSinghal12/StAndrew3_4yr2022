package Lec21;

public class TowerofHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		toh(3, "A", "C", "B");

	}
	
	public static void toh(int n,String from,String to,String using)
	{
		if(n == 0)
		{
			return;
		}
		else {
			toh(n-1, from, using, to);
			System.out.println("Move "+n+" disk form "+from+" to "+to);
			toh(n-1, using, to, from);
		}
	}

}
