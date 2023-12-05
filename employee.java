import java.util.*;
class NameisInvalid extends Exception
{
    String msg="Invalid Employee Name";
    public String toString()
    {
        return msg;
    }
}
class Employee
{
    String name;
    Employee(String name)
    {
        this.name=name;
    }
}
class EmployeeException
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=input.nextLine();

        
            try{
                for(int i=0;i<name.length();i++)
                {
                    int ch=(int)name.charAt(i);
                    if((ch>=65 && ch<=90)|| (ch>=97 && ch<=122))
                    {

                    }
                
                else
                {
                    throw new NameisInvalid();
              
                }
                }
                  System.out.println("Name:-\t"+name);
            
            }
        
               
           
            catch(NameisInvalid e)
            {
                System.out.println(e);
            }




        
    }
}