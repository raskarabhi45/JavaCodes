import java.lang.*;

class Demo
{
    public int i;
    public int j;
    public static int k;

    static
     {
        System.out.println("Inside static block");
        k=11;
    } 
        
    

    public Demo()
    {
        this.i=0;
        this.j=0;
        System.out.println("Inside default constructor");
    }

    public void fun()
    {
        System.out.println("Inside non-static fun");
        System.out.println(this.i);
        System.out.println(this.j);
        System.out.println(this.k);
    }
    
   
    

    public static void gun()
    {
        System.out.println("Inside static gun");
        System.out.println(k);
    }

}


class Staticdemo
{
    public static void main(String a[])
    {
        Demo.gun();

        Demo obj;  //it is just a refetence 
        obj=new Demo();  //actual memory allocated
       /* obj.fun();

        System.out.println(obj.i);
        System.out.println(obj.j); */

    }
}