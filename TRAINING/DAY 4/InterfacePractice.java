 /*Interface extending another interface? ✔️ Valid.
 Interface with a main method? ✔️ Valid — it's just a static method.
 Interface with private static methods? ✔️ Valid from Java 9*/


class Main{
    public static void main(String[] args)
    {
       System.out.println(Interface.x);
    }
}
interface Interface
{
     int x=10; // public static final by default
}
interface Interface2 extends Interface
{
    //x=15; -> final x cannot be changed 
    private void main(){} // private methods are allowed, cannot be overriden, need to have a body here, cannot be used by the daughter class, cannot be abstract, since abstract methods are always public
}
class Classs implements Interface2
{
    final static int x=100;
   
}



