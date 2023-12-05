import java.util.Scanner;
import java.io.*;
class covidException extends Exception
{
  covidException()
{
System.out.println("Patient is Covid positive and needs to be hospitalized");
}
}
class patient
{
    String name;
    int age;
    double oxylevel,HRCT;
    public patient(String name,int age,double oxylevel,double HRCT)
    {
      this.name=name;
      this.age=age;
      this.oxylevel=oxylevel;
      this.HRCT=HRCT;
    }
    public static void main (String args[])throws IOException
    {
        Scanner input=new Scanner(System.in);
        System.out.println(" Enter the name");
        String name=input.nextLine();
        System.out.println("Enter the Age");
        int age=input.nextInt();
        System.out.println("Enter the Oxygen Level");
        double oxylevel=input.nextDouble();
        System.out.println("HRCT Report");
        double HRCT=input.nextDouble();
        patient pobj=new patient(name,age,oxylevel,HRCT);
        try
        {
        if(pobj.oxylevel<95 && pobj.HRCT>10)
        throw new covidException();
        else
        System.out.print("Patient Information \n");
        System.out.println("Name :"+pobj.name);
        System.out.println("Age :"+pobj.age);
        System.out.println("Oxygen level :"+pobj.oxylevel);
        System.out.println("HRCT Report :"+pobj.HRCT);
        }catch (covidException e)
       {
}
}
}














