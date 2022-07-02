
class Mythread1
{
    public static void main(String a[])
    {
    System.out.println("Inside main");
    
    Thread tobj=Thread.currentThread();

    System.out.println("Name of the current thread is : "+tobj.getName());
    }
}