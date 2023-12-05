import java.util.*;
class nameException extends Exception
{
    nameException()
    {
        super("Name is invalid");
    }
}
class emp
{
    public static void main(String args[])
{
String name;
int flag=0;
try
{
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the name");
    name=input.nextLine();
    for(int i=0;i<name.length();i++)
    {
        if(Character.isDigit(name.charAt(i)))
        {
            flag=1;
            throw new nameException();
        }
    }
    if(flag==0)
    {
      System.out.println("Name is :"+name);
    }
}
catch(nameException e)
{
    System.out.println(e);
}
}
}