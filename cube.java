import java.util.Scanner;
interface cube
{
    int calculate(int n);
}
class Printcube
{
public static void main (String args[])
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the number");
int x=input.nextInt();
cube c=(int n)->n*n*n;
int ans=c.calculate(x);
System.out.println("cube =>"+ans);
}
}