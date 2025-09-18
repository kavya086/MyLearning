class practice
{
	public static void main(String[] args)
		{
			new daughter("XYZ");
		}
}
class superpractice
{
	String name;
	superpractice(String name)
	{

		this.name=name;
		System.out.println("Welcome to JAVA, "+name);
		
	}
}
class daughter extends superpractice
{
	daughter(String name)
	{
		super(name);
		System.out.println("Have a good day, "+name);
	}
}
