import java.util.Scanner;
class  Lcm
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first num");
		int n1=s.nextInt();

		System.out.println("Enter the second num");
		int n2=s.nextInt();

		int large =n1>n2 ? n1:n2;
		 while (true)
		 {
			 if (large%n1==0 && large%n2==0)
			 {
				 System.out.println(large);
				 break;
			 }
			 large++;
		 }

	}
}
