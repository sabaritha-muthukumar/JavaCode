import java.util.*;
public class SwapSentence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String str1=sc.nextLine();
char ch[]=str.toCharArray();
String s[]=str1.split(" ");
String res="";
for (int i=0;i<ch.length;i++)
{
for(int j=0;j<s.length;j++)
{
if(ch[i]==s[j].charAt(0))
{
res=res+s[j];
}
}
}
System.out.println(res+" ");
}
}
