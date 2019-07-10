import java.util.*; 
public class Spiral
 {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int[][] arr=new int[a][a];   
               for(int i=0;i<arr.length;i++)
               {
               for(int j=0;j<arr.length;j++)
               {
               arr[i][j]=sc.nextInt();
               }
               }
int row1=0;
int row2=arr.length-1;
int col1=0;
int col2 =arr[0].length-1;
 
  while(row1 <= row2 && col1 <= col2){
   
   for (int i = row1; i <= col2; i++) {
    System.out.print(arr[row1][i] + " ");
   }


   for (int j = row1+1; j <= row2; j++) {
    System.out.print(arr[j][col2] + " ");
   }
    

   if(row1+1 <= row2){
    for (int k = col2-1; k >= col1; k--) {
     System.out.print(arr[row2][k] + " ");
    }

   }
   if(col1+1 <= col2){
    for (int k = row2-1; k > row1; k--) {
     System.out.print(arr[k][col1] + " ");
    } 
}
 row1++;
 row2--;
 col1++;
 col2--;
  }
 }
}