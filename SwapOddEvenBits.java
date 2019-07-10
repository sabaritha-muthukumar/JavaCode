import java.util.*;
public class SwapOddEvenBits{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String b="";
while(n>0){
b=n%2+b;
n=n/2;
}
if(b.length()%2==1) b='0'+b;
char[] a=b.toCharArray();
System.out.print(b);
char t;

for(int i=0;i<b.length()-1;i=i+2){
t=a[i];
a[i]=a[i+1];
a[i+1]=t;
}
int k=0;
System.out.println();

int sum=0;
for(int i=0;i<a.length;i++){
k=a.length-1-i;
if(a[i]=='1')
sum+=Math.pow(2,k);
}

System.out.println(sum);
}
}