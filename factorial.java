//java prgm to factorial....
import java.util.*;
public class factorial {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number:");
        int n=s.nextInt();
        s.close();
       long fact=1;
       for(int i=1;i<=n;i++)
       {
        fact=fact*i;
       }
        System.out.println(fact);
    }
}
