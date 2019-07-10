import java.util.*;
public class Firstrep
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
for(char c:a.toCharArray())
{
if(a.indexOf(c)!=a.lastIndexOf(c))
{
System.out.println("first :"+c);
break;
}
}
}
}