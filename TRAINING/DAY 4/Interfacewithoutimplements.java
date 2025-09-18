
//interface without the keyword "implements"
class Main //no implements keyword
{
    public static void main(String[] arg)
    {
        Interface inter=new Interface() //accessing method hello() in this interface
        {
            public void hello()  //Overriden
            {
                System.out.println("HELLO");
            }
        };
        inter.hello();

	    /*new Interface(){
		public void hello()
		{
			System.out.println("HELLO");
		}
        }.hello(); */
    }
}
@FunctionalInterface
interface Interface
{
	void hello();
}

