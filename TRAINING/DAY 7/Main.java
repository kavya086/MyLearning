import java.io.*;

class Person implements Serializable
{
	String nam;
	int ag;
	Person(String name, int age)
	{
		nam=name;
		ag=age;
	}	
}
class Main 
{
	public static void main(String[] ar) throws Exception
	{
	Person person1=new Person("XYZ",22);
	ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("File1.txt"))); 
	oos.writeObject(person1); //writing the object into oos - in the file File1.txt , It will be a garbage value only.		
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream(new File("File1.txt")));
        System.out.print(ois.readObject()); //read the object and prints the hashcode
        
        Person person2=(Person)ois.readObject(); //assigns person2 object as same as person1     
        System.out.println(person2);  //prints hashcode of person2
	System.out.println(person2.ag); //prints age
	}
}


