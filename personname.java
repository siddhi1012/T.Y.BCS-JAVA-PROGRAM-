import java.util.*;
class person
{
    public static void main(String args[])
    {

Scanner input=new Scanner(System.in);
System.out.println("Enter  the name");
String name=input.nextLine();
String a[]=name.split(" ");
System.out.println(a[2]+" "+a[0].substring(0,1).toUpperCase()+a[0].substring(1)+" "+a[1]);









    }
 






}