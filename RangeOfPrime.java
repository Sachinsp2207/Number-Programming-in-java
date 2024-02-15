package numberprog;

import java.util.Scanner;

public class RangeOfPrime {
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int st=s.nextInt();
		int end=s.nextInt();
		
		
		for (int i = st; i <end; i++) {
		int j;
			for ( j = 2; j < i; j++) {
				if (i%j==0) {
					break;
				}
			}
			if (i==j) {
				System.out.println(i);
			}
		}
	}
}
