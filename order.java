import java.util.Scanner;
abstract class order
{
    int id;
    String descp;
    Scanner input=new Scanner(System.in);
    public void dataset(int id,String descp)
    {
        this.id=id;
        this.descp=descp;
   }
abstract public void accept();
abstract public void display();
}
class purchasesorder extends order
{
    String custname;
    public void accept()
    {
     System.out.println("Enter Customer name");
     String custname=input.nextLine();
       
    }

public void display()
{
System.out.println("\t"+id+"\t"+descp+"\t"+custname);
}
}
class salesorder extends order
{
String vendername;
public void accept()
{
    System.out.println("Enter the vender name");
    String  vendername =input.nextLine();
  
}
public void display()
{
    System.out.println("\t"+id+"\t"+descp+"\t"+vendername);
    }
}
class Demo
{
public static void main(String args[])
{
    Scanner input =new Scanner(System.in);
    purchasesorder obj[]=new purchasesorder[3];
    for(int i=0;i<3;i++)
    {
        obj[i]=new purchasesorder();
        System.out.println("Enter Customer data");
        
        System.out.println("Enter Id");
        int id=input.nextInt();

        System.out.println("Enter the description");
        input.nextLine();
        String descp=input.nextLine();

        obj[i].dataset(id,descp);
        obj[i].accept();
    }
    System.out.println("Purchased Details");
    System.out.println("\t id \t Description \t Customer name");
    for(int i=0;i<3;i++)
    {
        obj[i].display();
    }
    salesorder sobj[]=new salesorder[3];
    for(int i=0;i<3;i++)
    {
        sobj[i]=new salesorder();
        System.out.println("Enter the Vendor Data");

        System.out.println("Enter id");
        int id=input.nextInt();

        System.out.println("Enter Description");
        String descp=input.nextLine();

        sobj[i].dataset(id,descp);
        sobj[i].accept();
    }
    System.out.println("Sales Order Details");
    System.out.println("\t id \t description \t vendor name");
    for(int i=0;i<3;i++)
    {
        sobj[i].display();
    }
    }
}