import java.util.Scanner;
class  Rotation
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num!");
		int num=s.nextInt();
		int pow=1;
		int sum=0;
		int temp=num;
		int rem;
		int count=0;
		while (temp!=0)
		{
			temp=temp/10;
			count++;
		}
		for (int i=1;i<=count-1 ;i++ )
		{
			pow=pow*10;

		}
			int rot=s.nextInt();
			for (int j=1;j<=rot;j++)
			{
			
			rem=num%10;
			num=num/10;

			sum=pow*rem+num;
			System.out.println(sum);
			num=sum;
			}
	}
}
