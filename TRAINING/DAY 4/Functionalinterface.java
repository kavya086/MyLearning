@FunctionalInterface
interface Functionalinterface
{
	public void display();
	//public void display1(); //error - Only one abstract class is allowed in a Functional Interface

	default void print() //allowed
	{

	}
	static void printHello() //allowed, but called with className
	{

	}
	
}
class Classs implements Functionalinterface
{
	public void display()
	{
		
	}
	public static void main(String[] args)
	{
		Classs cls=new Classs();
		cls.display();
	}
}