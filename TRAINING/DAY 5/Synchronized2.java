class Synchronized2
{
    public static void main(String[] args)
    {
    Synchronized shared = new Synchronized();
    thread obj=new thread(shared, 5);
    thread obj1=new thread(shared, 15);
  
}
}
class Synchronized
{
    thread t=new thread();
    public void multiply(int number)
    {
        synchronized(this)
        {
        try{
        for(var i=1;i<=10;i++)
        {
            System.out.println(number +"*"+i+"="+number*i);
            t.sleep(1000);
        }
        }catch(Exception e){}
        }
    }
}
class thread extends Thread
{
    
    Synchronized sync;
    int number;
    thread(){}
    thread(Synchronized sync, int number)
    {
        this.sync=sync;
        this.number=number;
        this.start();
    }
    public void run()
    {
        sync.multiply(number);
    }
}
