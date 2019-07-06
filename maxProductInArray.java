import java.util.*;
public class maxProductInArray
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
int arr1[]=new int[num];
int temp=0;
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(arr[i]>arr[j])
{
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
int b=arr[num-1]  * arr[num-2];
{
System.out.println(b);
}
}
}