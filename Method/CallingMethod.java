import java.util.Scanner; 
class CallingMethod 
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		sumOfDigit(num);

	}
	public static void sumOfDigit(int num)
	{
		int sum=0;
		while (num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
		}
		System.out.println(sum);
		squareOfNum(sum);
	}
	public static void squareOfNum(int num)
	{
		System.out.println(num*num);
	}

}
