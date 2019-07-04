import java.util.*;
public class RevGivenString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String s[]=str.split(" ");
int num=sc.nextInt();
String rev="";
String a=s[num];
char ch[]=a.toCharArray();
for(int j=ch.length-1;j>=0;j--)
{
rev=rev+ch[j];
}
System.out.println(rev);
}
}
