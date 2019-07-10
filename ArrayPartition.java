
import java.util.*;
public class ArrayPartition{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int[] a=new int[n];
int[] b=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int pivot=s.nextInt();
int k=0,t=0;
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]<a[j]){
t=a[j];
a[j]=a[i];
a[i]=t;
}
}
}


for(int i=0;i<n;i++){
if(a[i]<pivot)
{b[k]=a[i];
k++;
}
}
for(int i=0;i<n;i++){
if(a[i]==pivot)
{b[k]=a[i];
k++;
}
}
for(int i=0;i<n;i++){
if(a[i]>pivot)
{b[k]=a[i];
k++;
}
}

for(int i=0;i<n;i++){
System.out.print(b[i]+" ");
}
}
} 