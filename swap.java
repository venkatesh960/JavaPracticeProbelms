//Java Program to Swap Two Numbers
import java.util.*;
public class swap {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
         System.out.println("enter two number:");
         int x=obj.nextInt();
         int y=obj.nextInt();
         obj.close();
         int z=x;
         x=y;
         y=z;
         System.out.println(x+" "+y);

    }
    
}
