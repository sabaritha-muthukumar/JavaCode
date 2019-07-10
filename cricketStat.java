
import java.util.Scanner;
public class cricketStat {
    public static void main(String[] args)
    {   int[] pl=new int[12];
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        int r=0,e=0,b=0,w=0,p1=1,p2=2,st=p1,nst=p2,p=2;
        for(int i=0;i<n.length();i++){
            int t=(int)n.charAt(i)%49+1;
//            System.out.println(t);
        if(n.charAt(i)!='W')b++;
            if(n.charAt(i)=='W')e++;
        else if(n.charAt(i)=='.');
        else if(n.charAt(i)=='O'){w++;
            if(st==p1){st=p2;nst=p1;}
            else {st=p1;nst=p2;}
            if(nst==p1)p1=p+1;
            else p2=p+1;
                nst=p+1;
             p++;
             continue;
        }
        else if(t%2==1){
            pl[st]=t+pl[st];
            if(st==p1){st=p2;nst=p1;}
            else {st=p1;nst=p2;}
        }
            else
            pl[st]=t+pl[st];
            if((b)%6==0&&b!=0){
            if(st==p1){st=p2;nst=p1;}
            else {st=p1;nst=p2;}
        }
            //System.out.print(st);
        }
        
        
        for(int i=1;i<=p;i++)
        {   
            r+=pl[i];
            System.out.println("P"+i+" - "+pl[i]+"(runs)");
            
        }
        System.out.println("Strike - P"+st);
        System.out.println("Non-Strike - P"+nst);
        System.out.println("Total - "+(r+e));
        System.out.println("Overs - "+b/6);
        System.out.println("Extra - "+e);
        System.out.println("Wicket - "+w);
        System.out.println("Remaining Wicket - "+ (10-w));
    }
}