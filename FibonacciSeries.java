import java.util.Scanner;
 
public class FibonacciSeries 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       int x = sc.nextInt();
      int a = 0;
      int b = 1;
      int c = 0;
         while (c< x)
        {
          c = a +b;
           a = b;
            b= c;
        }
         if(c== x)
        System.out.println("yes");
        else
        System.out.println("no");
       
    }    
}