import java.util.Scanner;
class  Ambani
{
	public static void main(String[] args) 
	{  
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=s.next();
		String a=name;
		String b="anil";

		if (name==b)
		{
			System.out.println("elligible");

		}
		else
		{
			System.out.println("not elligible");
		}
	}
}
