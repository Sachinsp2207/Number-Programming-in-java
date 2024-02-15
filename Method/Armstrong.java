import java.util.Scanner;
class  Armstrong
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter start num");
		int start=s.nextInt();
		System.out.println("enter start num");
		int end=s.nextInt();
		

       for (int i=start;i<end ; i++)
       {
       
            if(arm(i))
            {
                System.out.println(i);
            }
       }

	}
	public static boolean arm(int ip)
	{
		int count=count(ip);
        int sum=0;
        for (int i=ip;i!=0;i/=10)
        {
            int rem=i%10;
            sum=sum+power(rem,count);
        }
		if (ip==sum)
		{
			return true;
		}
		else
		{
			return false;
		}

    }

    public static int count(int num)
	{
		int ct=0;
		for (int i=num;i!=0;i/=10)
		{ 
			ct++;
    	}
        return ct;
    }
    public static int power(int base,int rem)
    {
        int pow=1;
        for (int i=1;i<=rem;i++)
        {
            pow*=base;
        }
        return pow;
     }

}