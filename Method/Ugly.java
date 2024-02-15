import java.util.Scanner;
class  Ugly
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the num");
		int ip=s.nextInt();
		int i;
		for (i=2;i<=ip ;i++ )
		{
			if (ip%i==0)
			{
				ip/=i;
				i--;
			}
		}
		if (i<=5)
		{
			System.out.println("Its ugly");
		}
	 else
		{
			System.out.println("Its Beautyful");
		}
	}
}
