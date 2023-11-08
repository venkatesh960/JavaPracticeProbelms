//Java Program to Count Number of Digits in an Integer
import java.util.Scanner;
public class countno {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter an integer:");
        int num=n.nextInt();
        n.close();
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        System.out.println("the number of interger are: "+count);

    }
    
}
