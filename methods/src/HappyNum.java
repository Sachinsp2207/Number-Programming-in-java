import java.util.Scanner;
class  HappyNum
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();

		int op=SquareOfDigit.square(num);
		while(op!=1)
			{
				op=SquareOfDigit.square(op);
			
				if (op==1)
				{
					System.out.println("HAPPY NUMBER");
					break;
				}
				
			}	 
		}
}

