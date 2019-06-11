class HelloWorld
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		int x,y;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		sum(x,y);

	}
	static void sum(int a,int b)
	{
		System.out.println("The sum is "+(a+b));
	}
}