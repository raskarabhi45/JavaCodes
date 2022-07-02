//string comparison
import java.io.*;

class StringXXXXX
{
    public static void main(String a[])
    {
        String str1="Hello";
        String str2="Hello";
        String str3= new String("Hello");

        if(str1==str2) //if(100==100) comparing references that is hash code
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are different");
        }
        //inbuilt data for data comparison
        //this one is always better
        if(str1.equals(str2))  //if("Hello".equals("Hello"))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are different");
        }

        if(str1==str3) //if(100==100) comparing references that is hash code
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are different");
        }

    }
}