
import java.lang.*;
import java.util.*;

class Exception4
{
    public static void main(String arg[])
    {
        int Arr[]={10,20,30,40,50};//still memory get allocated in heap
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter the index");
        int index=sobj.nextInt();
 
        try
         {
            System.out.println("Inside try");
        System.out.println("Element at that index is:"+Arr[index]); 
         }
         catch(java.lang.ArrayIndexOutOfBoundsException obj) //specific catch
         {
            System.out.println("Inside catch");
             System.out.println(obj);
         }

         catch(Exception obj)      //generic catch
         {
            System.out.println(obj);
         }
         finally
         {

            System.out.println("Inside finally");
            sobj.close();
         }

         System.out.println("End of Application");
    }
}
