import java.util.*;
class CovidPositiveException extends Exception
{
    String msg="Patient is covid  positive(+) and need to be hospitalized";
    public String toString()
    {
        return msg;
    }
}
class Patient
{
    String p_name;
    int p_age;
    int p_oxy_level;
    int p_HRCT_report;

    Patient(String n,int a,int ol,int hr)
    {
        p_name=n;
        p_age=a;
        p_oxy_level=ol;
        p_HRCT_report=hr;
    }
    void display()
    {
        System.out.println("p_name\t\tp_age\t\tp_oxy_level\t\tp_HRCT_report");
        System.out.println(p_name+"\t\t"+p_age+"\t\t"+p_oxy_level+"\t\t"+p_HRCT_report);
    }
}
class hospital
{
    public static void main(String args[])
    {
        Scanner input=new Scanner (System.in);
        try{
            System.out.println("Enter patient name");
            String n=input.nextLine();
            System.out.println("Enter patient age");
            int a=input.nextInt();
            System.out.println("Enter patient oxygen level");
            int ol=input.nextInt();
            System.out.println("Enter patient HRCT report");
            int hr=input.nextInt();
            Patient p=new Patient(n,a,ol,hr);
            if(p.p_oxy_level<95 && p.p_HRCT_report>10)
            {
                throw new CovidPositiveException();
            }
            p.display();
        }
            catch(Exception e)
            {
                 System.out.println(e);
            
            }
            






        


    }
}