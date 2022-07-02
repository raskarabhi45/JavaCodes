import java.util.*;

class Input
{
    public static void main(String a[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please Enter your name");
        String name=sobj.nextLine();

        System.out.println("Please Enter your age");
        int Age=sobj.nextInt();

        System.out.println("Please Enter your percentage");
        float percentage=sobj.nextFloat();

        System.out.println("Your name is:"+name);
        System.out.println("Your age:"+Age);
        System.out.println("Your percentage:"+percentage);
        sobj.close();
    }
}