class currenttime
{
    public static void main(String[] args)
    {
        String str3=new String("Helloo");
        long sb3=System.currentTimeMillis();
        //System.out.println(sb);
        for(var i=0;i<10000;i++)
        {
           str3+="Hiiiii";
        }
        long st3=System.currentTimeMillis();
        System.out.println("String took: "+(st3-sb3));
	
        StringBuffer str=new StringBuffer("Helloo");
        long sb=System.currentTimeMillis();
        //System.out.println(sb);
        for(var i=0;i<10000;i++)
        {
            str.append("Hiiiiii");
        }
        long st=System.currentTimeMillis();
        System.out.println("String Buffer took: "+(st-sb));
        
        StringBuilder str1=new StringBuilder("Helloo");
        long sb1=System.currentTimeMillis();
        //System.out.println(sb);
        for(var i=0;i<10000;i++)
        {
            str1.append("Hiiiiii");
        }
        long st1=System.currentTimeMillis();
        System.out.println("String Builder took: "+(st1-sb1));

	    
    }
}