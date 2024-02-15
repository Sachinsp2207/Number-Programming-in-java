import java.util.Scanner;
class Strong
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter num");
		int num =s.nextInt();//145
		int temp=num;//145
		int sum=0;
		for (;num>0; )//145>0
		{
			int rem=num%10;//5//4//1//0 false
			int fact=1;//1
			for (int i=1;i<=rem ;i++)
				{
					fact=fact*i;//1*1=1/1*2=2/2*3=6/6*4=24/24*5=120///1*1=1/1*2=2/2*3=6/6*4=24///1
				}
			sum=sum+fact;//0+120=120//120+24=144//144+1=145/////////////
			num=num/10;//145/10=14///14/10=1//0
		}
		if (temp==sum)//145==145
		{
			System.out.println("Strong Number!!");
		}
		else
		{
			System.out.println("NOt A Strong Number");
		}
	}
}
