import java.lang.*;

class Demo extends Thread
{
    public void run()  //3 Running state
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("Value of i : "+i );
            try
            {

            Thread.sleep(1000);
            }
            catch(Exception obj)
            {}
        }

    }

}

class Mythread5
{
    public static void main(String arg[]) throws Exception 
    {
        Demo obj1=new Demo();   //1 New state
        Thread t1=new Thread(obj1,"First");
        Demo obj2=new Demo();   //1 New state
        Thread t2=new Thread(obj1,"Second");

        t1.start() ; //2 Runnable state

        t1.join();  //dudh aalyavr chaha......

        t2.start() ; //2 Runnable state

        // 4 Dead state
    }
}