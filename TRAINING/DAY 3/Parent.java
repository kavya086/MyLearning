interface Parent
{
	public void parent();
}
interface Daughter
{
	public void daughter();
}

interface Interface1 implements Parent,Daughter
{

	@Override
	public void parent()
	{
		System.out.println("Dau");
	}

	@Override
	public void daughter()
	{
		System.out.println("Dau");
	}
    
}

class Main
{
    public static void main(String[] args)
    {
        Interface1 i=new Interface1();
        i.parent();
        i.daughter();
    }
}

