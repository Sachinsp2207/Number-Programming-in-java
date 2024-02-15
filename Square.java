import java.util.Scanner;
class Square 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		
		while (num!=0)
		{
			int pow=num*num;
			System.out.println(pow);
			break;
		}
		
		
	}
}