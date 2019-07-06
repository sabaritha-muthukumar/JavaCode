import java.util.*;
public class IsStringRotated
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
String str2=sc.nextLine();
String res="";
res=str1+str1;
if(res.contains(str2))
{
System.out.println("true");
}
else
{
System.out.println("false");
}
}
}