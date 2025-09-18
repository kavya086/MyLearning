class string
{
	String str="Hello"; //string declaration by LITERAL
	String str1= new String("Hello");  //string declaration by OBJECTS
	String str2=str1.toUpperCase();
	StringBuffer str3=new StringBuffer("Hello");
	StringBuffer str4=str3.append(". Have a good day! ");
	StringBuilder strr= new StringBuilder("Hello");
	//StringBuilder str5=strr.append(". Good to be here! ");
	StringBuilder str6=strr.replace(0,5,"BOLOOOO");
   // StringBuilder str7=strr.delete(0,4);
	
	
	string()
	{
	//	System.out.println(str +" "+str1);
		System.out.println(str1);
		System.out.println(str2); // str1 not changed - immutability [String class]
		System.out.println(str3); //str3 has changed - mutable [StringBuffer Class]
		System.out.println(str4);
	//	System.out.println(str5);
		System.out.println(str6);
	//	System.out.println(str7);
	}

public static void main(String[] args)
    {
	new string();
    }
}