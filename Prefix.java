import java.util.*;
public class Prefix
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
char ch[]=str.toCharArray();
String a="";
for(int i=0;i<ch.length;i++)
{
for(int j=ch.length-1;j>0;)
{
if(ch[i]==ch[j])
{
a=a+ch[i];
i++;
j++;
}else if(ch[i]!=ch[j])
{
j--;
}
}
}
System.out.println(a);
}
}