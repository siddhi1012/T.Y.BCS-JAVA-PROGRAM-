import java.util.Scanner;
abstract class staff
{
protected  int mid;
protected String name;
public staff(int mid,String name)
{
this.mid=mid;
this.name=name;
}
}//parent class

class officestaff extends staff
{
String dept;
public officestaff(String dept,int mid,String name)
{
super(mid,name);
this.dept=dept;
}
//child class 

void display()
{
System.out.println(mid+"\t"+name+"\t"+dept);
}
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter How many number of members details you want to feed:");
int n=input.nextInt();
officestaff obj []=new officestaff[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter the member id");
int mid=input.nextInt();

System.out.println("Enter the member name");
input.nextLine();
String name=input.nextLine();

System.out.println("Enter the member department");
String dept=input.nextLine();

obj[i]=new officestaff(dept,mid,name);
}
System.out.println("id\tname\tdepartment\t");
for(int i=0;i<n;i++)
{
obj[i].display();

}

}
}