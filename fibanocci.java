import java.util.Scanner;
class fibnoacci
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,i;
n=sc.nextInt();
int a=0,b=1;
if(n==0)
System.out.println(a);
else
{
System.out.println(a);
System.out.println(b);
for(i=3;i<=n;i++)
{
  sum=a+b;
  a=b;
  b=sum;
 System.out.println(sum);
}
}
}
}

  