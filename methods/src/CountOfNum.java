class CountOfNum 
{
	public static void main(String[] args) 
	{
	   int ct=count(1);
	  System.out.println(ct);
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
}
