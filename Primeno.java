package numberprog;

import java.util.Iterator;

public class Primeno
{
	public static void main(String[] args) 
	{	int i;
	int num=13;
		for ( i=2;i<num;i++)
		{
			if (num%i==0)
			{
				break;
			}
		}
		System.out.println(i);
		if (num==i)
		{
			System.out.println("its a prime no");
			System.out.println(i);
		}
			
		else 
		{
			System.out.println("its not  a prime no");
		}
	
		
	}
}
