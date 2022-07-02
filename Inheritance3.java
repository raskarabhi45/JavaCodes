import java.lang.*;


class Base
{
    public int i;
    public int j;
     
    public Base(int a,int b)

    {
        System.out.println("Inside parametrized constructor");
        this.i=a;
        this.j=b;
    }
    public void fun()
    {
        System.out.println("Inside base fun");
    }

}

class Derived extends Base  //class Derived :public Base in c++
{
    public int x;
    public int y;

    public Derived()            //Derived::Base(11,21) in c++
    {
        super(11,21);  //3rd use
        System.out.println("Inside derived constructor");
        this.x=30;
        this.y=40;
    }

    public void sun()
    {
        System.out.println("Inside derived sun");
        System.out.println(super.i); //1st use
        super.fun();     //2nd use
    }
}

class Inheritance3
{ 
    public static void main(String a[])
    {
       
        System.out.println("Inside main");
        Derived dobj=new Derived();

        dobj.sun();
       

    }
}

