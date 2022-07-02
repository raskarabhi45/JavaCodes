//priority in Thread
import java.lang.*;

class Marvellous extends Thread
{
    public void run()    // 3 state running
    {
        System.out.print("Inside thread : "+Thread.currentThread().getName());
        System.out.println("Thread priority is :"+Thread.currentThread().getPriority());
    }

}

class Mythread9
{
    public static void main(String a[])
    {
        System.out.println("Main Thread priority is :"+Thread.currentThread().getPriority());

        Marvellous mobj1=new Marvellous();
        Thread t1=new Thread(mobj1,"First\n"); //1 state New

        Marvellous mobj2=new Marvellous();
        Thread t2=new Thread(mobj2,"Second\n");
        
        t1.setPriority(10);
        t2.setPriority(2);

        t1.start();  //1state Runnable(ready to run)
        t2.start();

        //4 state Dead
}
}