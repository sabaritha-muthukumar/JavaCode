import java.util.*;
public class TimeConversion
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String n=s.nextLine();

if(n.charAt(8)=='P')
{
int num=Integer.parseInt(n.substring(0,2));
num=num+12;
System.out.println(num+n.substring(2,8));
}
else
{
System.out.print(n.substring(0,8));
}
}
}