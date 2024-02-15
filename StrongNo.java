package numberprog;

import java.util.Scanner;

public class StrongNo {
public static void main(String[] args) {
	
	Scanner s=new Scanner (System.in);
	System.out.println("Enter the number");
	int ip=s.nextInt();
	int temp=ip;
	int op=fact(ip);
	if (op==temp) {
		System.out.println("Its Strong number");
		
	}
	else {
		System.out.println("Its Not A Strong Number");
	}
}
public static int fact(int ip)
{
	int sum=0;
	
	while(ip!=0)
	{
		int fact=1;
		int rem=ip%10;
		System.out.println(rem);
		for (int i = 1; i<=rem; i++) {
			fact=fact*i;
			System.out.println(fact);
		}
		sum=sum+fact;
		ip/=10;
		System.out.println(sum);
	}
	return sum;
	}
}
