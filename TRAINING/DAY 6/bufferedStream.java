import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;



class bufferedStream
{
	public static void main(String[] arj) throws Exception
	{
	File f=new File("Sample.txt");
	BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream (f));
	bos.write("Hello friends".getBytes());
	bos.close();

	BufferedInputStream bis=new BufferedInputStream(new FileInputStream (f));
	int i=bis.read();
	while(i!=-1)
	{
		System.out.println((char)i);
		i=bis.read();
	}
	bis.close();
	}
}