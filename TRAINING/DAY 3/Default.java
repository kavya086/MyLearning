
interface Parent
{
	void method();
	default public void method1()
	{
		System.out.println("method1 with Parent");
	}
}
interface Daughter
{
	void method2();
	default public void method1()
	{
		System.out.println("method1 with Daughter");
	}
}

class Implementation implements Parent, Daughter
{
	public void method()
	{
		System.out.println("method with Parent");
	
	}
	public void method2()
	{
		System.out.println("method2 with Daughter");
	
	}
	public void method1()
	{
		Parent.super.method1();
		Daughter.super.method1();
	}
}	

class Default
{
	public static void main(String[] args)
	{
		Implementation obj=new Implementation();
		obj.method();
		obj.method2();
		obj.method1();
	}
}




