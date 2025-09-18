class Main
{
	static int x=10;
	int y=10;
	void display()
	{
		x=18; //accessed by non-static method
	}
	public static void main(String[] args)
	{
		//static int y=10; //error - static cannot be defined in any block except as a class variable
		x=12; //accessed by static method
		new Main().main();
	}
	void main()
	{
		//y=20; //non-static variable 'y' cannot be accessed by static method
	}
}