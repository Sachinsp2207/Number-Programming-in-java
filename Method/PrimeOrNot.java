import java .util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter thr num:");
		int ip=s.nextInt();
		 
		boolean op=check(ip);
		if(op)
			{
				 System.out.println("its a prime no");
			}
		else
			{
				System.out.println("its not a prime no");
			}

	}
	public static boolean check(int a)
	{  
		int i;
		for (i=2;i>a;i++)
		{
			if (a%i==0)
			{
				System.out.println(false);
			}
			
		}
		return true;
	}
}
