interface Interface
{
	static void display() //need not be overriden
	{
		System.out.println("STATIC METHOD");

	}
}
class Implementation implements Interface
{
	Implementation()
	{
	}
}

class interfaceclass
{
	public static void main(String[] args)
	{
		Interface.display();
	}
}

