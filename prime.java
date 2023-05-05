import java.util.*;
class prime
{
  public static int ll,ul;
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter the lower limit: ");
    ll=s.nextInt();
    System.out.print("Enter the upper: ");
    ul=s.nextInt();
    for(int i=ll;i<=ul;i++)
    {
      if(isprime(i))
      {
        System.out.println(i);
      }
    }
  }
  public static boolean isprime(int n)
  {
    if(n==0||n==1)
    {
      return false;
    }
    for(int j=2;j<=(n/2);j++)
    {
        if(n%j==0)
        {
          return false;
        }
    }
    return true;
  }
}
