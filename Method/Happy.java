import java.util.Scanner;
class Happy
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int ip=s.nextInt();
		int ans=isHappy(ip);
		while (ans!=1)
		{
			if (ans==1||ans==4)
			{
				break;
			}
			else 
			{
				ans=isHappy(ans);
			}
		}
		if (ans==1)
		{
			System.out.println("happpy number");
		}
		else
		{
			System.out.println("sad number");
	
		}
	}
	public static int isHappy(int num)
	{
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem);
			num/=10;
		}
		return sum;
	}
	}
