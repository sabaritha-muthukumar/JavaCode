import java.util.*;
public class LongestConsecutiveSequence
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int c=1;
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(int i=0;i<n;i++)
{
if(arr[i+1]-arr[i]==1)
{
c++;
}
else
{
break;
}
}
System.out.println(c);
}
}
