//java Program to Convert Binary Number to Decimal
import java.util.*; 
public class binarytoDecimal {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter a binary digits::");
        int bin=n.nextInt();
        n.close();
        int decimal=0;
        int power=0;
            while(bin>0)
            {
            int lastDigit=bin%10;
            decimal=decimal+lastDigit*(int)Math.pow(2,power);
            power++;
            bin=bin/10;
            }
        System.out.println(decimal);
        

    }
    
}
