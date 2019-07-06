import java.util.*;
public class reverseEachWord

{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
String[] arr=str.split(" ");
String rev="";
for(int i=0;i<arr.length;i++)
{

for(int j=arr[i].length()-1;j>=0;j--)
{
rev=rev+arr[i].charAt(j);

System.out.print(rev);
}
}
}
}