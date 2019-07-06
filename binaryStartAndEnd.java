import java.util.*;
public class binaryStartAndEnd
{
public static void main(String args[])
{
int c=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int[] arr=new int[num];
for(int i=0;i<num;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<num;i++)
{
for(int j=i+1;j<num;j++)
{
if(arr[i]==1&&arr[j]==1)
{
c++;

}
}
}
System.out.println(c);
}
}

