import java.util.*;
public class Zerosones
{
public static void main(String ard[])
{
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
int arr[]=new int[no];
for(int i=0;i<no;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<no;i++)
{
if(arr[i]==0)
{
System.out.println(arr[i]);
}
}for(int j=0;j<no;j++)
{
if(arr[j]==1)
{
System.out.println(arr[j]);
}
else
{
System.out.println("invalid");
}
}
}
}
































