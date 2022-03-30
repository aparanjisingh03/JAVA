import java.util.Scanner;
class palindrome
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,r,rev=0,temp;
n=sc.nextInt();
temp=n;
while(n!=0)
{
  r=n%10;
  rev=rev*10+r;
  n=n/10;
}
if(rev==temp)
System.out.println("palindrome Number");
else
System.out.println("Not an palindrome Number");
}
}

 