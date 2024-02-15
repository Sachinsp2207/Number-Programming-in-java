
import java.util.Scanner;
class Uglyn 
{
	public static void main(String[] args) 
	{   
		Scanner s=new Scanner (System.in);
	    System.out.println("eEnter the number");
        int ip=s.nextInt();
        int i;
		for (i=2;i<=ip;i++)
	 {
		 if(ip%i==0)
			 {
			  ip/=i;
			  i--;
			 }
	}
    if (i<=5)
		{
		  System.out.println("it is ugly number");
	 }
    else
	 {
        System.out.println("its beautiful num");
	  }
	}
}

