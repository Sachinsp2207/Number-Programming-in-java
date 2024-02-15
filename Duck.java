import java.util.Scanner;
class  Duck
{
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the num");
		int num= s.nextInt();
		
		int l= num.length();
		int a=0;
		char b;
		for(int i=1;i<l;i++)
		{
			b=num.charAt(i);
			if (b==0)
				a++;
			
			
		}
		char c=num.charAt(0);
		if (b>0 && c!=0)
		{
			System.out.println("Duck num");
		}
		else 
		{
			System.out.println("its not Duck num");
		}
	}

}
