class  Increment
{
	public static void main(String[] args) 
	{
		int a =30;
		System.out.println(a++);//30//31
		System.out.println(++a);//31+1=32
		System.out.println(a);//32
		System.out.println(a++ + ++a);//(32+1(JUST UPDATE NOT USE THE VALUE)=32+33+1)=66
		System.out.println(a);//66
		int b =20;
		System.out.println(b--);//20 //19
		System.out.println(--b);//18//19-1
		System.out.println(b);//18
		System.out.println(b-- + --b);//(18-1(JUST UPDATE NOT USE THE VALUE)=18)+(17-1=16)=34
		System.out.println(b);//16
	}
}
