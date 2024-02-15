import java.util.Scanner;
class Grade 
{  
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);

		System.out.println("enter the marks");
		double result = s.nextDouble();
		
		
		if(result>=0 && result<=35)
		{
			System.out.println("fail");
		}																						
		 else if(result>=36 && result<=50)
		{
			 System.out.println("2 ND CLASS");
		}
		else if(result>=50 && result<=74)
		{
			System.out.println( "FIRST CLASS");
		}
		else if(result>=75 && result<=90)
		{
			System.out.println("DIST");
		}
		else if(result>=91 && result<=100)
		{
			System.out.println("EXCELLENT");
		}
		else 
		{
			System.out.println("NOT FROM THIS PLANET");
		}
	}
}
