class threadState
{
    public static void main(String[] arg)
    {
   // System.out.println(t1.getState());
    thread t=new thread();
    thread v=new thread();
    thread k=new thread();
    Thread t1=new Thread(t); //when implemented Runnable interface
    Thread v1=new Thread(t);
    Thread k1=new Thread(t);
    System.out.println(t1.getState()); //New state
    t1.start(); 
    System.out.println(t1.getState()); //Runnable state
    try{
    t1.join(); //Dead State
    }catch(Exception e){}
    System.out.println(t1.getState());
  //  v1.start();
  //  k1.start();
  
}
}
class thread implements Runnable
{
    public void run()
    {
        System.out.println("Hello");
        System.out.println("Hi");
        System.out.println("Bye");
       
    }
    
}
