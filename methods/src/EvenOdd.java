class EvenOdd 
{
	public static void main(String[] args) 
	{
		if (checkEven(0))
		{
			System.out.println("its Even !!");
		}
		else
		{
			System.out.println("its Odd");
		}
	}
	public static boolean checkEven (int a) 
	{
		return (a%2==0) ? true:false;
	}


}
