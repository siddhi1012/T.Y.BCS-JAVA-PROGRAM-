import java.io.*;
class filedisplay
{
    public static void main(String args[])throws Exception
    { 
        try{
        FileInputStream fis=new FileInputStream(args[0]);
        int ch;
        while((ch=fis.read())!=-1)
        {
        System.out.print((char)ch);
        }
        fis.close();

        }
        catch(Exception e)
        {
        System.out.println("Error"+ e.getMessage());
        }

    }




}