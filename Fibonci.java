import java.util.Scanner;
class Fibonci
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter  value");
		int num=s.nextInt();
		int n1=0;
		int n2=1;
		System.out.println("Fibonci series");
		while (num>0)
		{
		
		int n3=n1+n2;
		System.out.println(n1);
		n1=n2;
		n2=n3;
        num--;
	}
}
}