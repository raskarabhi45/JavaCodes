
import java.lang.*;

class Arithmatic<T>
{
    public T No1;
    public T No2;

    Arithmatic(T a,T b)
    {
        No1=a;
        No2=b;
    }

  public T Addition()
  {
    if((No1 instanceof Integer) && (No2 instanceof Integer))
    {
      return (T)(Integer)((Integer)No1+(Integer)No2);
    }
    else if((No1 instanceof Float) && (No2 instanceof Float))
    {
      return (T)(Float)((Float)No1+(Float)No2);
    }
    else if((No1 instanceof Double) && (No2 instanceof Double))
    {
      return (T)(Double)((Double)No1+(Double)No2);
    }
    else
    {
        return null;

    }
  }
}
class GenericOOP
{
public static void main(String arg[])
{
    Arithmatic <Integer> obj=new Arithmatic<Integer>(10,11);
    Integer iRet=0;
    iRet=obj.Addition();
    System.out.println("Addition is :"+iRet); 
}
}