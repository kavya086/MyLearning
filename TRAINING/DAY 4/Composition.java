//Composition
class class1
{
	//class2 obj;
	class1(){
        class2 obj=new class2();  //creating the object of one class in another class. This makes the class only exist until the upper class exist. This is known as COMPOSITION
	}
}
class class2
{
	
}
class Composition
{
	public static void main(String[] arg)
	{
		class1 obj2=new class1();
	}
}
