 import java.util.Scanner;
 interface deapartment
{
    public void deptname();
    public void depthead();
}
class hostel
{
String hname,hlocation;
int noofroom;
void hosetlname()
{
    System.out.println("Name of hostel: "+hname);
}
void hostellocation()
{
    System.out.println("Hostel Location"+hlocation);
}
void noofroom()
{
    System.out.println("Number of Rooms"+noofroom);
}
}
class student extends hostel implements deapartment
{
String sname,regno,elecsub;
String deptname,depthead;
int avgmarks;
void studentname()
{
    System.out.println("Student name"+sname);
}
String studentregno()
{
    System.out.println("student registration No "+regno);
    return regno;
}
void electivesubject()
{
    System.out.println("Elective Subject"+elecsub);
}
void avgmarks()
{
    System.out.println("Average marks"+avgmarks);
}
public void deptname()
{
    System.out.println("Department name"+deptname);
}
public void depthead()
{
    System.out.println("Department head"+depthead);
}
void studentadd()
{
    Scanner input= new Scanner(System.in);
    System.out.println(" Enter the student name");
    sname=input.nextLine();
    System.out.println("Enter the registration number");
    regno=input.nextLine();
    System.out.println("Enter Elective Subject");
    elecsub=input.nextLine();
    System.out.println("Enter the Hostel name");
    hname=input.nextLine();
    System.out.println("Enter Hostel Location");
    hlocation=input.nextLine();
    System.out.println("Enter Department Name");
    deptname=input.nextLine();
    System.out.println("Enter Department head");
    depthead=input.nextLine();
    System.out.println("Enter Number of Rooms");
    noofroom=input.nextInt();
    System.out.println("Enter Average Marks");
    avgmarks=input.nextInt();
}
void migrate()
{
Scanner input= new Scanner(System.in);
System.out.println("Enter  New Department Name");
deptname=input.nextLine();
System.out.println("Enter New Department head");
depthead=input.nextLine();
}
void display()
{
    studentname();
    studentregno();
    electivesubject();
    avgmarks();
    deptname();
    depthead();
}
}
class studentinfo
{
public static void main(String args[])
{
Scanner input=new Scanner(System.in);
student sobj[]=new student[100];
int sno=0;
String rno;
boolean b;
while(true)
{
System.out.println("1. Admit a Student");
System.out.println("2. migrate a Student");
System.out.println("3.Display a Student Detail");
System.out.println("4. Exit");
System.out.println("Enter the Choice");
int ch=input.nextInt();
switch(ch)
{
    case 1:
    sobj[sno]=new student();
    sobj[sno++].studentadd();
    break;

    case 2:
    System.out.println("Enter Registration No:");
    rno=input.nextLine();
    b=false;
    for(int i=0;i<sno;i++)
    {
        if(sobj[i].studentregno().equals(rno))
        { 
            b=true;
            sobj[0].migrate();
            break;
        }
    }
    if(b==false)
    {
        System.out.println("Student Not Found");

    }
    break;

    case 3:
        System.out.println("Enter Registration No:");
        rno=input.nextLine();
        b=false;
    for(int i=0;i<sno;i++)
    {
        if(sobj[i].studentregno().equals(rno))
        { 
            b=true;
            sobj[0].display();
            break;
        }
    }
    if(b==false)
    {
        System.out.println("Student Not Found");

    }
    break;
     case 4:
        System.exit(0);
}
}
}
}