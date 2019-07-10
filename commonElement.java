import java.util.*;
public class commonElement {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int com=0;
	//ArrayList<Integer> com = new ArrayList<Integer>();
int array1[] = new int[a];
int array2[] = new int[b];
 int array3[] = new int[c];
int x = 0, y = 0, z = 0;

while (x < array1.length && y < array2.length && z < array3.length){
if (array1[x] == array2[y] && array2[y] == array3[z]){
com.add(array1[x]);
x++;
y++;
z++;
		
}
		else if (array1[x] < array2[y])
			x++;
		else if (array2[y] < array3[z])
			y++;
		else
			z++;
	}
	System.out.println("Common elements from three sorted (in non-decreasing order ) arrays: ");
System.out.println(com);
}
}