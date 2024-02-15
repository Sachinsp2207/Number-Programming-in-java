package numberprog;

import java.util.Scanner;

public class RotationOfDigit {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number of rotation");
	int ror=s.nextInt();
	System.out.println("Enter the number");
	int ip=s.nextInt();
	int op=0;
	for(int i=1;i<=ror;i++) {
		 op=rotate(ip);
		ip=op;
	}
	System.out.println(op);
}	
public static int rotate(int ip) {
	
	int ct=Automorphic.count(ip);
	int pow=1;
	for(int i=1;i<ct;i++)
	{
		pow=pow*10;
	}
	int rem=ip%10;
	ip/=10;
	int ans=(rem*pow)+ip;
	return ans;
}
	
	
}
