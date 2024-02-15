package numberprog;

import java.util.Scanner;
class  Happy 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the num");
	int ip=s.nextInt();
	int op=sum(ip);
		while(true)
		{
			if (op==1||op==4)
			{
				
				break;
			}
			else{
				
				op=sum(op);
			}
		}
		if (op==1 ||op==4) {
			System.out.println("Happy number");
		}
	}
	public static int sum(int ip){
	int sum=0;
		while (ip!=0)
		{
			int rem=ip%10;
			
			sum=sum+(rem*rem);
			ip/=10;
		}
		System.out.println(sum);
		return sum;
	}
}
