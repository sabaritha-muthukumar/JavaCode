import java.util.*;
public class Coffee
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
for(int i=1;i<b;i++)
{
 a=a/2;
}
System.out.println(a);
}
}