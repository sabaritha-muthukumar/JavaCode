import java.util.*;
public class addSubMatrix
{
public static void main(String args[])
{
int sum=0;
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(num--!=0)
{
int row=sc.nextInt();
int col=sc.nextInt();
int[][] arr=new int[row][col];
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr[i][j]=sc.nextInt();
}
}
int x1=sc.nextInt();
int y1=sc.nextInt();
int x2=sc.nextInt();
int y2=sc.nextInt();
for(int i=x1-1;i<x2;i++)
{
for(int j=y1-1;j<y2;j++)
{
sum=sum+arr[i][j];

}
}
System.out.println(sum);
}
}
}