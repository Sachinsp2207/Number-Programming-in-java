import java.util.Scanner;
class  Asc
{	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter char:");
		char ch=sc.next().charAt(0);
		int a=ch;
		Ascvalue(a);
	}
	public static void Ascvalue(int a)
	{	
		System.out.println(a);	
	}		
	
}