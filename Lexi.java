import java.util.*;
public class Lexi
{
    public static void main(String[] args)
    {   
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        String str[]=new String[a];
for(int i=1;i<=a;i++)
{
str[i-1]=Integer.toString(i);
}
Arrays.sort(str);
System.out.println(str[b-1]);
}
}