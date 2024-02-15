
import java.util.Scanner;
class  MyName
{	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Name");
		String a=s.next();
		System.out.println("Enter The Last Name");
		String b=s.next();
		FullName(a,b);
	}
	public static void FullName(String a,String b)
	{
		System.out.println("My full Name is: "+a+" "+b);
	}
	
}