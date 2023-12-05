import java.util.Scanner;
interface productmarker
{
}
class product implements productmarker
{
int id,quantity;
String name;
double cost;
public product(int id,String name,double cost,int quantity)
{
    this.id=id;
    this.name=name;
    this.cost=cost;
    this.quantity=quantity;
}
public void display()
{
System.out.println(id+"\t"+name+"\t"+cost+"\t"+quantity);

}
public static void main(String args[])
{
    int count=0;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of Products");
    int n=input.nextInt();
    product obj[]=new product[n];
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter the id");
        int id=input.nextInt();

        System.out.println("Enter the name");
        input.nextLine();
        String name=input.nextLine();

        System.out.println("Enter the cost");
        double cost=input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity=input.nextInt();
        obj[i]=new product(id,name,cost,quantity);
        count++;
    }
    System.out.println("Product Details");
    System.out.println("id\tname\tcost\tquantity");
    for(int i=0;i<n;i++)
    {
    obj[i].display();
 
}
System.out.println("count="+count);
}
}