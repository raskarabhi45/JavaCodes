import java.lang.*;

abstract class Demo
{
    public int i,j;

    public Demo()
    {
        System.out.println("Demo constructor");
    }

    public void fun()  //concrete
    {
        System.out.println("Demo fun");
    }
    public abstract void gun();   //abstract  virtual void gun()=0;
}

class Hello extends Demo
{
    public int x,y;
    public Hello()    
    {
        System.out.println("hello constructor");
    }

    public void sun()   //concrete
    {
        System.out.println("hello sun");
    }

    public void gun()   //concrete
    {
        System.out.println("hello gun");
    }
}


class AbstractDemo1
{
    public static void main(String a[])
    {
      Demo dobj;    //we can create reference of abstract class
     // dobj=new Demo();  we cant create object of abstract class
      Hello hobj=new Hello();
      hobj.fun();
      hobj.gun();
      hobj.sun();

    }
}