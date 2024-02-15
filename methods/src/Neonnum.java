import java.util.Scanner;
class  Neonnum
{
	public static void main(String[] args) 
	{
		Scanner s =new Scanner (System.in);
		System.out.println("Enter The Number");
		int num=s.nextInt();
		int ans=neon(num);

		if (num==(SumOfDigit.sum(ans)))
        {
			System.out.println("Its Neon NUmber");
		}
		else
		{
			System.out.println("its natural Number");
		}

	}
	public static int neon(int num)
	{
		int sqr=(SquareOfDigit.square(num));
        return sqr;
	}
} 
