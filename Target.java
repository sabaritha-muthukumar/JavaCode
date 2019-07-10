import java.util.*;
public class Target
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int arr[]=new int[n];
int c=0;
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int search=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
arr[j]=-arr[j];
int sum=0;
for(int k=0;k<n;k++)
{
sum=sum+arr[k];
}
if(sum==search)
{
c++;
}
}
for(int m=0;m<n;m++)
{
arr[m]=Math.abs(arr[m]);
}
}
System.out.println(c);
}
}
