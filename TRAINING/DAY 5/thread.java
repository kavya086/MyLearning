class thread1 extends Thread
{
    thread1()
    {
        this.start();
    }
    public void run()
    {
        //Thread.currentThread().setName("Thread-Run"); //can set name explicitly
        System.out.println(Thread.currentThread().getName());
    }
}
class thread
{
    public static void main(String[] args)
    {
    thread1 obj = new thread1(); //will print the thread name of main() method
    Thread t = Thread.currentThread(); //creating instance "t" for Thread using Thread.currentThread()-used in static region
    System.out.println(t.getName());
    //getName() is a inbuilt method in Thread to get the name of the thread
    thread1 obj1 = new thread1(); //Multiple objects
    thread1 obj2 = new thread1();
}
}

