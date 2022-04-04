import java.util.Scanner;
class apr4_2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s1;
int i,l=0,u=0,d=0,s=0;
s1=sc.nextLine();
char ch[]=s1.toCharArray();
for(i=0;i<ch.length;i++)
{
  if(Character.isLowerCase(ch[i]))
    l++;
  else if(Character.isUpperCase(ch[i]))
    u++;
  else if(Character.isDigit(ch[i]))
    d++;
  else
   s++;
}
System.out.println(l+" "+u+" "+d+" "+s);
}
}
