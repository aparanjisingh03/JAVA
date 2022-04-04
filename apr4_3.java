import java.util.Scanner;
class apr4_3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
String s1,s2="";
s1=sc.nextLine();
char ch[]=s1.toCharArray();
for(i=0;i<ch.length;i++)
{
if(Character.isLetter(ch[i]))
s2=s2+ch[i];
}
System.out.println(s2);
}
}
