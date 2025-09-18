
class Main extends Thread{
    Thread t1=new Thread(this); //non-static Thread declaration
    Main() 
    {
        this.start(); //calls run()
    }
    public void run() 
    {
        try
         {for(int i=0; i<10; i++)
         {   System.out.println(i);
             t1.sleep(1000); //will throw an error that it interrupts the flow of execution of run(), So use try{} and catch(){} - Give as throws Exception , if it is in the main()
         }}catch(InterruptedException a){}
    }
}

class Main2
{
    public static void main(String[] ar) throws Exception //throws Exception used in the main() instead of try{} and catch(){}. There in the run() , throws Exception is not used because overriden methods cant use throws
    {
        Main main= new Main();
        Thread t2=Thread.currentThread(); //static declaration
        
        for(var i=0; i<10; i++)
        {
            System.out.println(i);
            t2.sleep(1000);
        }
    }
}
