class Main
{
    public static void main(String[] ah)
    {
        thread1 obj=new thread1();
        new Thread()
        {
            public void run()
            {
                obj.displayOdd();
            }
        }.start();
         new Thread()
        {
            public void run()
            {
                obj.displayEven();
            }
        }.start();
    }
}
class thread1
{
    public synchronized void displayOdd()
    {
        for(var i=1;i<=10;i+=2)
        {
            System.out.println(i);
            try{
            wait();
            }catch(Exception e){}
        }
    }
     public synchronized void displayEven()
    {
        for(var i=2;i<=10;i+=2)
        {
            {
            System.out.println(i);
            notify();
            }
        }
    }
}
