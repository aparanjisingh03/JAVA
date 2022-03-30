import java.util.Scanner;
class evenOdd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r,even=0,odd=0;
n=sc.nextInt();
while(n!=0)
{
  r=n%10;
  if(r%2==0)
   even=even+r;
  else
   odd=odd+r;
 n=n/10;
}
System.out.println(Math.abs(even-odd));
}
}