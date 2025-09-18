class Synchronized3
{
    public static void main(String[] ar)
    {
    Synchronized sync=new Synchronized();

    new Thread(){ //without extending thread class, Thread interface have been used directly
    public void run()
    {
       sync.getTable(5); //used object of Synchronized class
    }
    }.start();
    
    
    Thread t2=new Thread(){ //used thread object
    public void run()
    {
       sync.getTable(10);
    }
    };
    t2.start();
    }
}

class Synchronized
{
    public synchronized void getTable(int number)
    {
        Thread t=new Thread();
        try{
        for(var i=1;i<=10;i++)
        {
            System.out.println(number +"*"+i+"="+number*i); //printed tables
            t.sleep(100); //idol for 0.1s
        }
        }catch(Exception a){}
    }
}

