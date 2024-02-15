import java .util.Scanner;
class  FullName
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Num Of Name");
		int num=s.nextInt();
		


	if (num==3)
		{

			System.out.println("Enter The First Name");
			String fname=s.next();
			System.out.println("Enter The Middle Name");
			String mname=s.next();
			System.out.println("Enter The Last Name");
			String lname=s.next();

		}

		if (num==1)
		{
			System.out.println("Enter The First Name");
			String fname=s.next();
	
		}
		else
		{
			System.out.println("Enter The First Name");
			String fname=s.next();
		
			System.out.println("Enter The Last Name");
			String lname=s.next();
		}
		 
	}
}
