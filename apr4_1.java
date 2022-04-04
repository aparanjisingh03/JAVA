import java.util.Scanner;
class apr4_1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1,s2;
s1=sc.nextLine();
s2=sc.nextLine();
if(s1.contains(s2))
  System.out.println("yes");
else
  System.out.println("No");
}
}