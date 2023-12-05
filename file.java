import java.io.*;

class Slip13_1
{
                public static void main(String a[]) throws Exception
                {
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                String fname=a[0];

                                File f = new File(fname);
                                int num=0;
                                if(f.isDirectory())
                                {
                                                System.out.println("Contents of directory :"+fname);

                                                String s[] = f.list();
                                                for(int i=0; i<s.length; i++)
                                                {
                                                                File f1 = new File(fname, s[i]);

                                                                if(f1.isFile())
                                                                {

                                                                                System.out.println(s[i]+" is a file");

                                                                                if(s[i].endsWith("txt"))
                                                                                {
                                                                                                System.out.println("\nDo you want to delete the file with extension "+s[i]+" ?\n1:YES 2:NO");

                                                                                                int ch = Integer.parseInt(br.readLine());
                                                                                                if(ch==1)
                                                                                                {
                                                                                                                f1.delete();
                                                                                                                System.out.println("File has been deleted");
                                                                                                                num++;
                                                                                                }
                                                                                }
                                                                }             
                                                                else
                                                                                System.out.println("\n"+s[i]+" is a sub directory");
                                                }
                                                System.out.println("\nNumber of Deleted files are: "+num);
                                }
                                else
                                {if(f.exists())
                                                {
                                                                System.out.println("\n"+fname+" is a File");
                                                                System.out.println("Details of "+fname+" are : ");
                                                                System.out.println("Path of file is "+f.getPath());
                                                                System.out.println("Absolute Path of file is "+f.getAbsolutePath());
                                                                System.out.println("Size of file is "+f.length());
                                                }
                                                else System.out.println(fname+" file is not present ");

                                }
                }
}
