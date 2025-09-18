class staticpractice
{
	static int x;
	static
	{
		x=1;
		display();
	}
	static
	{
		x=5;
		display();	
	}
	static
	{
		x=10;
		display();	
	}
	static
	{
		x=15;
		display();	
	}
	static public void display()
	{
		System.out.println(x);
	}
	public static void main(String[] args)
	{
		static
		{
			display();
		}
	}
}