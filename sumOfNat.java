//sum of natural numbetrs.....
import java.util.*;
public class sumOfNat {
    public static void main(String [] args)
    {
        long sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter number if elements:");
        int n=obj.nextInt();
        sum=(n*(n+1))/2;
        System.out.println(sum);
        obj.close();
    }
    
}
