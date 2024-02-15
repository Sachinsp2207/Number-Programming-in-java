import java.util.Scanner;
class  PositiveOrNot
{	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Num");
		int num=s.nextInt();
		Check(num);
		
	}
	public static void Check(int num)
	{
		if (num>=1)
		{
			System.out.println("its a positive num");
		}
		else if  (num<=-1)
		{
			System.out.println("its a negative num");
		}
		else
		{
			System.out.println("its a Zero");
		}
	
		
	}
}
	