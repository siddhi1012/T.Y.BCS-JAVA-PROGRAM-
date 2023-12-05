import java.util.Scanner;
class continent
{
String  ct;
public continent(String ct)
{
    this.ct=ct;
}
void display()
{
    System.out.println("Continent "+ct);
}


class country extends continent
{
String cn;
public country(String ct,String cn)
{
    super(ct);
    this.cn=cn;
} 
void display()
{
    super.display();
    System.out.println("country"+cn);
}
}

class state extends country
{
String s;
public state(String ct,String cn,String s)
{
    super(cn,ct);
    this.s=s;
}
void display()
{
super.display();
System.out.println("State"+s);
}
}

class place extends state
{
String p;
public place(String ct,String cn,String s,String p)
{
    super(s,cn,ct);
    this.p=p;
}
 void display ()
 {
    super.display();
    System.out.println("place"+p);
 }
}
}
public class multilevel
{
public static void main(String args[])
{
String ct,cn,p,s;
Scanner input=new Scanner(System.in);
System.out.println("Enter the continent name");
ct=input.nextLine();

System.out.println("Enter the country name");
cn=input.nextLine();

System.out.println("Enter the State name");
s=input.nextLine();

System.out.println("Enter the Place name");
p=input.nextLine();


System.out.println("continent=>"+ct);
System.out.println("country=>"+cn);
System.out.println("state=>"+s);
System.out.println("place=>"+p);
} 
}


