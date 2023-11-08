//lcm of two numbwers
import java.util.*;
public class lcm {
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("enter the two numbers:");
        int num1=num.nextInt();
        int num2=num.nextInt();
        int lcm=0;
        lcm=(num1>num2)?num1:num2;
        while(true)
        {
            if(lcm%num1==0 && lcm%num2==0)
            {
                System.out.println("the lcm of  "+num1+" and "+num2+" is ="+lcm);
                break;
            }
            ++lcm;
        }
        num.close();
    }
    
}
//or we can do as follow
//lcm=(n1*n2)/gcd;