import java.util.Scanner;
class  AdditionM1
{
	public static void main(String[] args) 
	{	
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the num");
		int a= s.nextInt();
		System.out.println("Enter the 2nd  num");
		int b= s.nextInt();
		add(a,b);
	}
	public static void add(int a,int b)
	{
		
		int res=a+b;
		System.out.println(res);
	}
}
