class Stringmethods
{
    public static void main(String[] args)
    {
    String str=new String("I love to welcome you all!");
    String str1=new String("I love to welcome you all!");
    System.out.println(str.length());
    System.out.println(str.charAt(9));
    System.out.println(str.concat("WELCOME"));
    System.out.println(str.equals(str1));
    System.out.println(str.equalsIgnoreCase("i LOVE to WELCOME you all!"));
    System.out.println(str.indexOf('o'));
    System.out.println(str.substring(10));
    System.out.println(str.substring(10,18));
    System.out.println(str.replace('o','e'));
    System.out.println("                     HELLO".trim());
    System.out.println(str.contains("0"));
    System.out.println(str.isEmpty());
    System.out.println(str.compareTo("I love welcome"));
}
}