import java.util.*;
public class Reverses
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int num=s.nextInt();
ArrayList<Integer> ar=new ArrayList<Integer>();
for(int i=0;i<num;i++)
{
ar.add(s.nextInt());
}
Collections.reverse(ar);
System.out.println(ar);
}
}	