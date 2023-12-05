import java.io.*;
import java.util.Scanner;
class invalidusernameException extends Exception
{
 public invalidusernameException()
{
    System.out.println("Invalid username");
}
}
class invalidpasswordException extends Exception
{
 public invalidpasswordException()
{
    System.out.println("Invalid password");
}
}
class emailid
{
String username,password;
 public emailid()
{
    username=" ";
    password=" ";
}
public emailid(String username,String password)
{
    this.username=username;
    this.password=password;
}
public static void main (String args[])
{

String username=args[0];
String password=args[1];
emailid obj=new emailid(username,password);
try{
if(("siddhigavhane").equals(obj.username))
System.out.println("Valid username");
else 
throw new invalidusernameException();
}catch(invalidusernameException e)
{
}
try{
if(("siddhi2003").equals(obj.password))
System.out.println("Valid password");
else 
throw new invalidpasswordException();
}catch(invalidpasswordException e1)
{
}
}
}