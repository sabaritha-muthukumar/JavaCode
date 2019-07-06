import java.util.*;
public class nonRepeatNum
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int arr[]=new int[num];
int c=0;
int a=0;
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
a=arr[i];
}

for(int i=0;i<num;i++)
{
c=0;
for(int j=0;j<num;j++)
{
if(arr[i]==arr[j])
{
c++;
}
}
if(c==1)
{
if(a>=arr[i])
{
a=arr[i];
}
}
}
System.out.println(a);
}
}