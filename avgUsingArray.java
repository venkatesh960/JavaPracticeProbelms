//Java Program to Calculate Average Using Arrays
//import java.util.*;
public class avgUsingArray {
    public static void main(String[] args)
    {
        int array[]={1,2,3,4,5,10};
        int sum=0;
        double avg=0;
        for(int i:array)
        {
            sum=sum+i;
        }
        avg=sum/(array.length);
         System.out.print(avg);

    }
    
}
