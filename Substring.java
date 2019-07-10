import java.util.*;
public class Substring
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       int len=str.length();
int num=len/2;
String a=str.substring(num,len);
String b=str.substring(0,num);
if(a.contains(b))
System.out.print("true");
else
System.out.print("false");
}}
