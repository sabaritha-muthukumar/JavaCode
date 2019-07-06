import java.util.Scanner;
public class Product
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int result=0;      
        int num1 = in.nextInt();
        int num2 = in.nextInt();
       for(int i=1;i<=num1;i++)
        {
            result=result+num2;
         }
        System.out.print(result);
    }
}