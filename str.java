import com.compare;
import conc.concat;
import java.util.Scanner;
public class str
{
    public static void main (String args[]) 
    {
Scanner input= new Scanner(System.in);
System.out.println("Enter first String");
String s1=input.nextLine();
System.out.println("Enter Second String");
String s2=input.nextLine();
compare cp=new compare();
cp.compare(s1,s2);
concat cc=new concat();
cc.concat(s1,s2);
}
} 