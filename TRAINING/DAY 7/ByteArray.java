import java.io.*;

class ByteArray
{
	public static void main(String[] arg) throws Exception
	{
	    
		String str="Good Afternoon all";
		ByteArrayOutputStream baos=new ByteArrayOutputStream();
		
		baos.writeBytes(str.getBytes());    //writing "Good Afternoon All" into the object using writeBytes 
		System.out.print(baos);
		
		FileOutputStream fos1=new FileOutputStream(new File("Hel1.txt"));
		FileOutputStream fos2=new FileOutputStream(new File("Hel2.txt"));
		baos.writeTo(fos1); //writes to multiple files Hel1.txt and Hel2.txt
		baos.writeTo(fos2);
		FileInputStream bais=new FileInputStream(new File("Hel1.txt"));
		int i=bais.read();
		while(i!=-1)
		{
		    System.out.print(i); // Bytes got converted back into String
		    i=bais.read();
		}
		    
	}
}