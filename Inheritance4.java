import java.lang.*;

/* 
class Object
{
    //contents
}
*/

class Base  //class Base extends Object
{
    public int i;
    public int j;
     
   
    public void fun()
    {
        System.out.println("Inside base fun");
    }

}

class Derived extends Base  //class Derived :public Base in c++
{
    public int x;
    public int y;

   
    public void gun()
    {
        System.out.println("Inside derived gun");
        DerivedX dobj=new DerivedX();
       
    }
}

class DerivedX extends Derived{
    public int a;

    public void sun()
    {
        System.out.println("Inside derivedx sun");
    }
}

class Inheritance4
{ 
    public static void main(String a[])
    {
       
        System.out.println("Inside main");
        Derived dobj=new Derived();

        dobj.sun();
       

    }
}


