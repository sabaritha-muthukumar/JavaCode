import  java.util.*;
public class Sorting
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
/*for(int i=0;i<num;i++)
{
for(int j=0;j<num;j++)
{
if(arr[i]%2==0)
{
System.out.println(arr[i]);
}
}
}*/
for(int i=0;i<num;i++)
{
for(int j=0;j<num;j++)
{
if(arr[i]%2!=0)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
for(int i=0;i<num;i++)
{
System.out.println(arr[i]);
}
}
}
