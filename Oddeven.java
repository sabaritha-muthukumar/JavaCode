import java.util.*;
public class Oddeven
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
//if((num &1)==0)
if((num/2)*2==num)
System.out.println("even");
else
System.out.println("odd");
}
}