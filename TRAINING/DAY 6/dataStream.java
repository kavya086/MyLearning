import java.io.*;

class dataStream
{
	public static void main(String[] args) throws Exception
	{
		File f=new File("SampleData.txt");
		FileOutputStream fos=new FileOutputStream(f);
		DataOutputStream dos=new DataOutputStream(fos);
		dos.writeInt(12);
		dos.close();
		FileInputStream fis=new FileInputStream(f);
		DataInputStream dis=new DataInputStream(fis);
		System.out.println(dis.readInt());
		dis.close();

	}
}