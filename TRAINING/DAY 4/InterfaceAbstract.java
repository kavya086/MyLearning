	//abstract classes with interface
interface Interface
{
    void method1();
    void method2();
    void method3();
    void method4();
}
abstract class Classs implements Interface
{
    public void method1(){  //abstract classed need not to implement all the methods from interface. The remaining unimplemented methods, remain as abstract methods in this abstract class. 
        
    }
   /* public void method2(){
    }
    public void method3(){
        
    }
    public void method4(){
        
    }*/
}
abstract class Classs2 implements Interface
{
    public void method2(){
    }
    public void method3(){
        
    }
    public void method4(){
        
    }
}
class Main{
    public static void main(String abc[])
    {
        
    }
}
