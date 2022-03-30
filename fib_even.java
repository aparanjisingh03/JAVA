import java.util.Scanner;
class fib_even
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,i;
n=sc.nextInt();
int a=0,b=1,even=0;

for(i=0;i<=n;i++)
{
  sum=a+b;
  a=b;
  b=sum;
  if(sum%2==0)
  even=even+sum;
}
System.out.println(even);
}
}

  