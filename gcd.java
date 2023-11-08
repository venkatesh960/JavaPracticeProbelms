//java prgm for greatest common divisor...
import java.util.*;
public class gcd {
    public static void main(String[] args)
    {
       Scanner num=new Scanner(System.in);
       System.out.println("enter two mumers:");
       int num1=num.nextInt();
       int num2=num.nextInt();
       int gcd=1;
       for(int i=1;i<=num1&&i<=num2;++i)
       {
        if(num1%i==0&&num2%i==0)
        {
            gcd = i;
        }
       }
       System.out.println("the gcd of"+num1+" and "+num2+" is "+gcd);
       num.close();
    }
}

