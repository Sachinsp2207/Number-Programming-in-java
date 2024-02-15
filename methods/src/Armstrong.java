import java.util.Scanner;
class  Armstrong
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter The Num");
			int num=s.nextInt();
			int ct=(CountOfNum.count(num));
        
			int sum=0;
			for (int i=num;i!=0;i/=10)
			{
				int rem=i%10;
				sum=sum+(Power.power(rem,ct));
			}
			if (num==sum)
			{
				System.out.println("Armstrong number");
			}
			else
			{
				System.out.println(" Not Armstrong number");
			}
		
	}
}
