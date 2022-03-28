import java.util.Scanner;
class temperature
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int t;
    t=sc.nextInt();
    if(t<0)
     System.out.println("freezing weather");
    else if(t>=0 && t<=10)
     System.out.println("very cold weather");
    else if(t>=10 && t<=20)
     System.out.println("cold weather");
    else if(t>=20 && t<=30)
     System.out.println("normal in temp");
    else if(t>=30 && t<40)
     System.out.println("its hot");
    else
     System.out.println("its very hot");
   }
}
 