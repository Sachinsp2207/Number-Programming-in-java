package numberprog;

import java.util.Scanner;

public class Automorphic {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int ip=s.nextInt();
int temp=ip;
int ct=count(ip);
int pow=1;
for(int i=1;i<=ct;i++) {
	pow=pow*10;
}
int sq=ip*ip;
int ext=sq%pow;

if(ext==temp) {
	System.out.println("its automorphic number ");
}
else
{
	System.out.println("Its not an Automorphic number");
	}

	}
public static int count(int ip){
	int ct=0;
	while(ip!=0) {
		int rem=ip%10;
		ct++;
		ip/=10;
	}
	return ct;
}
}
