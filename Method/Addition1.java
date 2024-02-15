class  Addition1
{
	public static void main(String[] args) 
	{	
		add(10,20);
		Mul(11,10+2,30);
	}
	public static void add(int a,int b)
	{
		
		int res=a+b;
		System.out.println(res);
	}
	public static void Mul(int a,int b,int c)
	{
		
		int res=a*b*c;
		System.out.println(res);
	}
}