class Banking
{
	int balance=0;
	public synchronized void withdraw(int amount)
	{
		System.out.println("Withdrawal Amount: "+amount);
		while(balance<amount)
		{
			System.out.println("Insufficient Balance");
				try{
		         wait();
		        }catch(Exception e){}
		}
	
		balance=balance-amount;
		System.out.println(amount +" Successfully Withdrawn");
		
	}
	public synchronized void deposit(int amount)
	{
	   
		balance=balance+amount;
		System.out.println(amount +" Successfully Deposited");
		notifyAll();
	}
	public synchronized int getBalance()
	{
	    return(balance);
	}
}


class Bank
{
	public static void main(String[] at) throws Exception
	{
		Banking sync=new Banking();
		System.out.println("Balance: "+sync.getBalance()); //prints the initial balance
		Thread t1=new Thread() //when multiple run() are used, Use this form of writing run() methods.
		{
			public void run()
			{
				sync.withdraw(1000); 
			}
		};
		t1.start();
		
		Thread t2=new Thread()
		{
			public void run()
			{
				sync.deposit(1000);
			}
		};
		t2.start();
		t2.join();    //waits for the above action to be completed by not allowing any other thread to enter the critical execution part. PREVENTS THE EXEUCTION OF OTHER THREADS until the execution of the assigned object is completed.
		Thread t3=new Thread()
		{
		    public void run()
			{
				sync.withdraw(2000);
			}
		};
		t3.start();
		Thread t4=new Thread()
		{
		    public void run()
			{
				sync.deposit(4000);
			}
		};
		t4.start();
		t4.join();
		
	//	t1.join();
	//	t3.join();
		System.out.println("Balance: "+sync.getBalance()); //prints the final Balance
		
	}
}
