import java.util.Scanner;
class SquareOfEvenNum 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the num");
		int num=s.nextInt();
		if (num%2==0)
			{
				int pow=num*num;
				System.out.println(pow);
			}	

	}
}