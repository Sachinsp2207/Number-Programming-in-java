import java.util.Scanner;
class  Bigger
{	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter First num");
		int a=s.nextInt();
		System.out.println("Enter Second num");
		int b=s.nextInt();
		Bigger(a,b);

	}
	public static void Bigger(int a,int b)
	{
	if (a>b)
	{
		System.out.println(a+" "+"its a bigger num");
	}
	else
		System.out.println(b+" "+"its a bigger num");
	}
}
