import java.lang.*;
import java.io.*;

class Input2
{
    public static void main(String arg[]) 
    {
        //2 objects as resource iobj amd bobj
        InputStreamReader iobj=new InputStreamReader(System.in);
        BufferedReader bobj=new BufferedReader(iobj);
        try
        {
    System.out.println("Enter your name:");
    String name=bobj.readLine();

    System.out.println("Your name is:"+name);

    System.out.println("Your name is:");
    int age=Integer.parseInt(bobj.readLine());
    System.out.println("Your age is:"+age);


        }
        catch(IOException obj)
        {
            System.out.println("Exception occurs");
        }
        finally
        {
            //resource deallocation
            iobj=null;
            bobj=null;
        }
    }
}