package numberprog;

import java.util.Iterator;

public class PrimeCount {

	public static void main(String[] args) {
		int num=1;
		int count=0;
		 for (int i =1; i<=num; i++) {
			 if(num%i==0)
			 {
				 count++;
			 }
		}
		 if ((count==2) &&(num>1)){
			System.out.println("prime no");
		}
		 else
		 {
			 System.out.println("not");
		 }
	}
}
