import java.util.Scanner;
class Switch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
ch=sc.next().charAt(0);
switch(ch)
{
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
   System.out.println("vowel");
   break;
default:
   System.out.println("not vowel");
}
}
}