import java.io.ByteArrayInputStream;

class ByteArrayInputStream2
{
	public static void main(String[] arg)
	{
	    
		String x="{1,2,3,4,5}"; //String
		ByteArrayInputStream bais=new ByteArrayInputStream(x.getBytes()); //String converted into ByteArray
		int i=bais.read();
		while(i!=-1)
		{
		    System.out.print((char)i); // Bytes got converted back into String
		    i=bais.read();
		}
		    
	}
}