class Parent
{
	Parent()
	{
		System.out.println("Parent class");
	}
}
class Daughter extends Parent
{
	Daughter()
	{
		System.out.println("Daugther class");
	}
}
class constructorChaining
{

	public static void main(String[] args)
	{
		Daughter obj=new Daughter();
	}
}