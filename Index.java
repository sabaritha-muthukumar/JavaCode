import java.util.*;
public class Index
{
public static void main(String[] args)
{   
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=0;
}
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j=j+i)
{
if(arr[j]==0)
arr[j]=1;
else if(arr[j]==1)
arr[j]=0;
j++;
}
}
for(int i=0;i<n;i++)
{
System.out.println(arr[i]);
}
}
}