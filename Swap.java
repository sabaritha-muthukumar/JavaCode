import java.util.*;
public class Swap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
System.out.println("After swapping");
a=a+b;
b=a-b;
a=a-b;
System.out.println(" A= "+a);
System.out.println(" B= "+b);
}
}