//Reverse a Number using a while loop in Java
import java.util.*;
public class reverseno {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter an integer:");
        int num=n.nextInt();
        n.close();
        int rem=0;
        while(num>=1)
        {
            rem=num%10;
            num=num/10;
            System.out.print(rem);
        }
       
    }
    
}
