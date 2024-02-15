import java.util.Scanner;
class PrimeRange 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter start num");
		int start= s.nextInt();
		System.out.println("Enter end num");
		int end= s.nextInt();
		
		int i= start;
		int j;
		for (;i<=end;i++)
		{ 
			
			for (j=2;j<i;j++ )
			{
				if (i%j==0)
				{
					break;
				}
			}
		if (i==j)
			{
				System.out.println(i);
			}		
		}
	}
}