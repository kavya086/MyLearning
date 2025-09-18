
class runtimepolymorphism
{
	public void display()
	{
	    System.out.println("FELLOW");
	}
}
class runtimepolymorphism2 extends runtimepolymorphism
{
    @Override
	public void display()
	{
	    System.out.println("HELLO");
	}
}
class Main
{
    public static void main(String[] args)
    {
	//runtimepolymorphism obj=new runtimepolymorphism();
	//obj.display();
	//runtimepolymorphism obj1=new runtimepolymorphism2();
	//obj1.display();
	runtimepolymorphism obj;
	//obj=new runtimepolymorphism();
	obj=new runtimepolymorphism2();
	obj.display();
    }
}
