class staticpractice
{
	static int x=1;
	static
	{
		for(var i=0;i<10;i++)
			{add1();}	
	}
	static
	{
		add1();	
	}
	static
	{
		add1();	
	}
	static
	{
		add1();	
	}
	static public void add1()
	{
		x++;
	}
	public static void main(String[] args)
	{
		System.out.println(x);
	}
}