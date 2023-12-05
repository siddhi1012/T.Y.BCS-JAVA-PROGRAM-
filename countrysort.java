import java.util.*;
class countrysort
{
    public static void main (String args[])
    {
        Scanner input= new Scanner(System.in);
        System.out.println("How many Country name");
        int n=input.nextInt();
        String country[]=new String[n];
       
        input.nextLine();
        for(int i=0;i<n;i++)
        {    
             System.out.println("Enter the country name");
            country[i]=input.nextLine();
        }
        System.out.println("Country name Without sort");
        for(String ele :country)
        {
            System.out.println(""+ele);
        }
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(country[i].compareTo(country[j])<0)
                {
                    temp=country[i];
                    country[i]=country[j];
                    country[j]=temp;
                }
            }
        }
        System.out.println("Country name Descending order");
        for(String ele :country)
        {
            System.out.println(""+ele);
        }


    }

}