//Interface with a final method? ❌ Invalid. Interface methods can't be final — they're meant to be implemented/overridden.

class Main{
    public static void main(String[] args)
    {
        
    }
}
interface Interface
{
    public final void method1();   //modifier final not allowed here
    
}
class classs implements Interface
{
    public void method1()
    {
        System.out.println(" ");
    }
}
