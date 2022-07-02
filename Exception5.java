
import java.lang.*;
import java.util.*;

class Demo
{
    public int Division(int no1,int no2) throws ArithmeticException
    {
        return no1/no2;
    }
}
class Exception5
{
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter 1st number");
        int ino1=sobj.nextInt();

        System.out.println("Enter 2nd number");
        int ino2=sobj.nextInt();

        Demo dobj=new Demo();
        try
        {
        int ret=dobj.Division(ino1,ino2);
        System.out.println("Division is:"+ret);
        }
        catch(ArithmeticException obj)
        {
            System.out.println("Inside catch");
        }

        
    }
}