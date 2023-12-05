import java.util.*;
class armstrong
{
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=input.nextInt();
        int sum=0;
        int temp=n;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(sum==temp)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println(" Not Armstrong");
        }
    }
}