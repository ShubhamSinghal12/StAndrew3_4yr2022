package Lec8;

public class AggressiveCows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stalls = {1,2,4,8,9};
		int c = 4;
		BSAG(stalls, c);

	}
	public static void LSAG(int[] stalls,int c)
	{
		int i = 1;
		while(i <= stalls[stalls.length-1])
		{
			if(isItPossible(stalls, c, i))
			{
				i += 1;
			}
			else
			{
				break;
			}
		}
		System.out.println(i-1);
	}
	
	public static void BSAG(int[] stalls,int c)
	{
		int si = 1;
		int ei = stalls[stalls.length-1];
		int ans = 1;
		
		while(si <= ei)
		{
			int mid = (si+ei)/2;
			if(isItPossible(stalls, c, mid))
			{
				ans = mid;
				si = mid+1;
				
			}
			else
			{
				ei = mid-1;
			}
		}
		System.out.println(ans);
	}
	public static boolean isItPossible(int[] stalls,int c,int dist) {
		int noc = 1;
		int place = stalls[0];
		
		for(int i = 1; i < stalls.length; i++)
		{
			if(place + dist <= stalls[i])
			{
				noc ++;
				place = stalls[i];
			}
			
		}
		if(noc >= c)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
