import java.util.*;
public class capitalizeFirstLetter
{
public static void main(String args[])
{
String a;
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String arr[]=str.split(" ");
for(int i=0;i<arr.length;i++)
{
a=Character.toString(arr[i].charAt(0));
System.out.print(a.toUpperCase()+arr[i].substring(1)+" ");
}
}
}