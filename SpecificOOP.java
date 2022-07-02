

import java.lang.*;
class Arithmatic
{
    public int no1;
    public int no2;

    Arithmatic(int a,int b) 
    {
        no1=a;
        no2=b;
    }

  public int Addition()
  {
      int Ans=0;
      Ans=no1+no2;
      return Ans;
  }

}
class SpecificOOP
{
public static void main(String arg[])
{
    Arithmatic obj=new Arithmatic(10,11);
    int iRet=0;
    iRet=obj.Addition();
    System.out.println("Addition is :"+iRet);
    
}
}