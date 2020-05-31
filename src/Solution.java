import java.util.*;
public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String a=sc.nextLine();
            String b=sc.nextLine();
            int count=0;
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<=a.length()-1;i++){
                sb.append(a.substring(0,i));
                sb.append(b);
                sb.append(a.substring(i,a.length()));
                String c=sb.toString();
                StringBuilder sd;
                sd=sb.reverse();
                String d=sd.toString();
                //System.out.println(c);
                //System.out.println(d);
                if(c.equals(d)){
                    count++;
                    //System.out.println(count);
                }
                sb=new StringBuilder();
            }
            sb.append(a);
            sb.append(b);
            String c=sb.toString();
            StringBuilder sd;
            sd=sb.reverse();
            String d=sd.toString();
            if(c.equals(d)){
                count++;
            }
            System.out.println(count);
        }
    }
    
}
