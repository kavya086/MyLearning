//using Sleep method that is interruption


class sleepMethod extends Thread{
    Thread t1=new Thread(this); //non-static Thread declaration
    sleepMethod() 
    {
        this.start(); //calls run()
    }
    public void run() 
    {
         try
         {for(int i=0; i<10; i++)
         {
             System.out.println(i);
             t1.sleep(1000); //will throw an error that it interrupts the flow of execution of run(), So use try{} and catch(){} - Give as throws Exception , if it is in the main()
         }}catch(InterruptedException a){}
    }
}

class Sleep
{
    public static void main(String[] ar) 
    {
        sleepMethod obj= new sleepMethod();
    }
}