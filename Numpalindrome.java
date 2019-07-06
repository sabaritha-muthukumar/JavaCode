import java.util.*;
public class Numpalindrome
{
public static void main(String args[])
{
int rem,sum=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int temp=num;
while(num>0)
{
rem=num%10;
sum=(sum*10)+rem;
num=num/10;
}
if(temp==sum)
System.out.println("Palindrome");
else
System.out.println("Not Palindrome");
}
}