import java.util.*;
public class greatOnRight
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
int temp;
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<num-1;i++)
{
temp=arr[i+1];
for(int j=i+1;j<num;j++)
{
if(arr[j]>temp)
temp=arr[j];
}
arr[i]=temp;
}
arr[num-1]=-1;
for(int i=0;i<num;i++)
{
System.out.println(arr[i]+" ");
}
}
}