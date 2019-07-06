import java.util.*;
public class Subarray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
int sum=0,flag=0;
for(int i=0;i<num-1;i++)
{
sum=arr[i];
for(int j=i+1;j<num;j++)
{
sum=sum+arr[j];
if(sum==0)
{
flag++;
}
}
}
if(flag>0)
{
System.out.println("true");
}
else
{
System.out.println("flase");
}
}
}
