import java.util.*;
public class Equals
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int num1=sc.nextInt();
if((num ^ num1)==0)
System.out.print("Ans : equal");
else
System.out.print("Ans : not equal");
}
}