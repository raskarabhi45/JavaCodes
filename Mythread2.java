import java.lang.*;

class Marvellous extends Thread
{
    public void run()    // 3 state running
    {
        System.out.print("Inside thread : "+Thread.currentThread().getName());
    }

}

class Mythread2
{
    public static void main(String a[])
    {
        Marvellous mobj1=new Marvellous();
        Thread t1=new Thread(mobj1,"First"); //1 state New

        Marvellous mobj2=new Marvellous();
        Thread t2=new Thread(mobj2,"Second");
        
        t1.start();  //1state Runnable(ready to run)
        t2.start();

        //4 state Dead
}
}