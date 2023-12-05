import java.util.Scanner;
public interface opreation
{
double pi=3.142;
double area();
double volume();
} //interface
class cylinder implements opreation
{
double r,h;
public cylinder(double r,double h)
{
    this.r=r;
    this.h=h;
}
public double area()
{
    double a=2*pi*r*(r+h);
    return a;
}

public double volume()
{
    double vol=pi*r*r*h;
    return vol;
}
public static void main(String args[])
{
 Scanner input=new Scanner(System.in);

 System.out.println("Enter the radius :");
 double r=input.nextDouble();

 System.out.println("Enter the height :");
 double h=input.nextDouble();

 cylinder obj=new cylinder(r,h);

 double area=obj.area();
 double volume=obj.volume();

 System.out.println("Area => "+area+"\t"+"volume => "+volume);
}
}