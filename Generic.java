import java.lang.*;
//template<class T>  in c++
class Arithmatic <T>    // in java
{
  public T Addition(T No1,T No2)
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

class Specific
{
public static void main(String arg[])
{
    Arithmatic <Integer>obj=new Arithmatic<Integer>();
    Integer iRet=0;
    iRet=obj.Addition(10,11);
    System.out.println("Addition is :"+iRet);  

    Arithmatic <Float>obj2=new Arithmatic<Float>();
    Float dRet=0;
    dRet=obj2.Addition(10.8,11.4);
    System.out.println("Addition is :"+dRet);  
}
}