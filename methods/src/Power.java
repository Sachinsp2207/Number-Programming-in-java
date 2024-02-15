class Power 
{
	public static void main(String[] args) 
	{
		int pow=power(2,3);
		System.out.println(pow);
	}
	public static int power(int base,int raise)
	{
		int pow=1;
			for (int i=0;i<raise;i++ )
			{
			pow=pow*base;
			}
			return pow;
	}
}

