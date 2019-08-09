import java.util.*;
import java.lang.*;

public class Interest
{  
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int u = 0;
        int x = 0;
        String k = s.nextLine();
        String p[] = k.split(" ");
        int i = Integer.parseInt(p[0]);
        int j = Integer.parseInt(p[1]);
        u = i;
        while((i-(i*j*0.01)) >= 0){
        u= u + (i-((int)(i*j*0.01)));
        i = i - (int)(i*j*0.01);
        }
        System.out.println(u);
        
    }
}
