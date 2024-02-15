import java.util.Scanner;
class PrimeOrNot
{
	public static void main(String[] args) 
	{ 
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start num:");
		int start=s.nextInt();
		System.out.println("Enter end num:");
		int end=s.nextInt();
		 
		for (int i=start;i<=end ;i++ )
		{ 
			boolean op=check(i);
			if(op)
			{
				 System.out.println(i);
			}
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
