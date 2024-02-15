import java.util.Scanner;
class SumOfSquareOfIndividualDigit
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value");
		int num=s.nextInt();
		
		
		int sum=0;
		int pow=1;
		
		while (num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem);
			num/=10;

		}
		 System.out.println(sum);	
	}
}