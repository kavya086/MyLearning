class Synchronized1
{
    public static void main(String[] args)
    {
        Synchronized shared=new Synchronized(); //shared resource
       
        thread obj=new thread(shared);
        thread obj2=new thread(shared);
        thread obj3=new thread(shared);
        obj.start(); //calls run()
        obj2.start();
        obj3.start();
    }
}

class Synchronized
{
     Thread t1=new Thread();   //thread object 
     synchronized public void Synchronizedmethod()
    {
       
        try{
        for(var i=0;i<10;i++)
        {
            System.out.println(i);
            t1.sleep(1000);
        }
        }catch(Exception a){}
        
    }
}
class thread extends Thread
{
    Synchronized sync;
    thread(Synchronized sync)
    {
        this.sync=sync;
    }
 
    public void run()
    {
        sync.Synchronizedmethod(); 
    }
}
