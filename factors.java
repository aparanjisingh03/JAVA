import java.util.Scanner;
class factors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,pro=1,sum=0,i,res;
n=sc.nextInt();
for(i=1;i<=n;i++)
{
 if(n%i==0)
{
sum=sum+i;
pro=pro*i;
}
}
res=pro-sum;
System.out.println(res);
}
}