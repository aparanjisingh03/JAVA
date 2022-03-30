import java.util.Scanner;
class armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r,sum=0,temp,d;
n=sc.nextInt();
temp=n;
d=(int)Math.log10(n)+1;
while(n!=0)
{
  r=n%10;
  sum=sum+(int)Math.pow(r,d);
  n=n/10;
}
if(sum==temp)
System.out.println("Armstrong Number");
else
System.out.println("Not an Armstrong Number");
}
}

 