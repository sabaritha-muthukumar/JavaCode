import java.util.*;
public class Duplicate
{
public static void main(String arg[])
{
Scanner scan=new Scanner(System.in);
String str=scan.nextLine();
char[] ch=str.toCharArray();
       
for(int i=0;i<str.length-1;i++)
 {
for(int j=1;j<str.length;j++)
{
if(ch[i]==ch[j])
System.out.print(ch[i]);
}
}
}
}
        
