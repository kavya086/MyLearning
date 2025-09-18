import java.io.ByteArrayInputStream;

class Main
{
	public static void main(String[] arg)
	{
		byte[] x={1,2,3,4,5};
		ByteArrayInputStream bais=new ByteArrayInputStream(x);
		bais.read();
	}
}