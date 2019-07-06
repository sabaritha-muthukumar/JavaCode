import java.util.*;
public class manualSubString
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
strstr(a,b);
}
public static void strstr(String a,String b)
{
if(a.contains(b))
System.out.print(a.indexOf(b));
else
System.out.println(-1);
}
}