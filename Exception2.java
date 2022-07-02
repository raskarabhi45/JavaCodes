import java.util.*;

class Exception2
{
    public static void main(String arg[])
    {
        int ans=0,no1=0,no2=0;

        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter first number:");
        no1=sobj.nextInt();

        System.out.println("Please enter second number:");
        no2=sobj.nextInt();
        
        // jvm said::mi swata ethe jatine laksh ghalto 
        try 
        {
        ans=no1/no2; //Exception prone code
        //Apghat honyachi shakyta
        }

        catch(ArithmeticException obj)  //ex report after death
        {
            System.out.println("Exception is occured as:"+obj);
        }

        finally
        {
            sobj.close();
        }

        System.out.println("Division is:"+ans);
        //sobj.close();  //resource release /deallocation
    }
}