import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;


class fileStream
{
	public static void main(String[] arj) throws Exception
	{
	File f=new File("Sample.txt");
	FileOutputStream fos=new FileOutputStream(f);
	fos.write("Hello friends".getBytes());
	fos.close();

	FileInputStream fis=new FileInputStream(f);
	int i=fis.read();
	while(i!=-1)
	{
		System.out.println((char)i);
		i=fis.read();
	}
	fis.close();
	}
}