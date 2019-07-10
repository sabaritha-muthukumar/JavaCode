
import java.util.*;
public class pra {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String str=s.next();
char[] ch=str.toCharArray();
Stack<Character> st=new Stack<Character>();
for(int i=0;i<ch.length;i++) {
if(ch[i]=='{'||ch[i]=='('||ch[i]=='[') {
st.push(ch[i]);
} 
else if(ch[i]=='}') {
if(st.peek()=='{') {
st.pop();
}else
break;
}
else if(ch[i]==']') {
if(st.peek()=='[') {
st.pop();
}else
break;
}
else if(ch[i]==')') {
if(st.peek()=='(') {
st.pop();
}else
break;
}
}
if(st.empty()||ch[0]=='}'||ch[0]==']'||ch[0]==')')
System.out.println("Balanced");
else
System.out.println("Unbalanced");
}
}