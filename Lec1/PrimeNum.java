package Lec1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = 2;
		int count = 0;
		int num = sc.nextInt();
		boolean flag = true;
		while(i<=num/2) {
			if(num%i==0)
			{
//				System.out.println(i);
				flag = false;
				break;
			}
			i+=1;
		}
//		System.out.println(count);
		if(flag)
		{
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}

	}

}
