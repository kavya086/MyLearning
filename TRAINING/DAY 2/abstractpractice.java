
abstract class abstractpractice
{
  abstract public void display(); //no body, must be in a abstract class, must be overriden
}
class abstractpractice2 extends abstractpractice
{
    @Override
	    public void display()
	    {
	        System.out.println("hi");
	    }
}
class Main
{	
    public static void main(String[] args)
	{
		abstractpractice2 obj=new abstractpractice2();
		obj.display();
	}
}
