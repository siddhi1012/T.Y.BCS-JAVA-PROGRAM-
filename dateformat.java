import java.text.SimpleDateFormat;
import java.util.Date;
class dateformat
{
    public static void main(String args[])
    {
        Date date=new Date();

        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        String str=sdf.format(date);
        System.out.println("Current date is:"+str);

        sdf=new SimpleDateFormat("dd-MM-yyyy");
        str=sdf.format(date);
        System.out.println("Current date is:"+str);

       
        sdf=new SimpleDateFormat("EE MMMM dd hh:mm:ss z yyyy");
        str=sdf.format(date);
        System.out.println("Current date and time is:"+str);

        sdf=new SimpleDateFormat("dd/MM/yy hh:mm:ss a Z");
        str=sdf.format(date);
        System.out.println("Current date and time is:"+str);

        sdf=new SimpleDateFormat("hh:mm:ss");
        str=sdf.format(date);
        System.out.println("Current time is:"+str);

        sdf=new SimpleDateFormat("w");
        str=sdf.format(date);
        System.out.println("Current week of year:"+str);

        sdf=new SimpleDateFormat("W");
        str=sdf.format(date);
        System.out.println("Current week of month:"+str);

        sdf=new SimpleDateFormat("D");
        str=sdf.format(date);
        System.out.println("Current day of the year:"+str);

    }
}