class  CheckPrime
{
	public static void main(String[] args) 
	{
		boolean op=isPrime(5);
		if (op==true)
		{
			System.out.println("Its Prime Num  !!");
		}
		else
		{
			System.out.println("not a prime number");
		}
	}
	public static boolean isPrime(int num)
	{
		int i;
		for (i=2;i<num ;i++)
		 {
			 if (num%i==0)
			 {
				 return false;
			 }
			}
		 return true;
	}

}
