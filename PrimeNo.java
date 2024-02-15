import java.util.Scanner;
class PrimeNo 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num= s.nextInt();
	    int i;
		for ( i=2;i<num;i++)
		{
			if (num%i==0)
			{
				break;
			}
		}
		if (i==num)
		{
			System.out.println("its a prime no");
		}
			
		else 
		{
			System.out.println("its not  a prime no");
		}
	
	}
}

	


