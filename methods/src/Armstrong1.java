
class  Armstrong1
{
	public static void main(String[] args) 
	{
			boolean arm=(armstrong(567));
		   System.out.println(arm);
		
	}
	public static boolean armstrong(int num) 
	{
		
		int ct=(CountOfNum.count(num));
        
			int sum=0;
			for (int i=num;i!=0;i/=10)
			{
				int rem=i%10;
				sum=sum+(Power.power(rem,ct));
			}
			if (num==sum)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
}


