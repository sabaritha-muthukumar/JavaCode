import java.util.*;
public class valueInIndex
{
public static void main(String args[])
{
int c=0;
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int arr[]=new int[b];
int arr1[]=new int[b];
for(int i=0;i<a;i++)
{
arr[i]=sc.nextInt();
}
if(arr[i]>=0&&arr[i]!=i)
{
int n=arr[arr[i]];
arr[arr[i]]=arr[i];
arr[i]=n;
}
else
{

System.out.println("-1");
}
System.out.println(Array.toString(arr));
}
}