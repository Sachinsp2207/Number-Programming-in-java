import java .util.Scanner;
class  Scan1
{
	public static void main(String[] args) 
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The First Num");
		int ip1=s.nextInt();
		System.out.println("Enter the Second num");
		int ip2=s.nextInt();
		 int ans=ip1+ip2;
		 System.out.println(" the addition of   "+ip1+"   and    "+ip2+"   is  : "+ans);
		}
}
