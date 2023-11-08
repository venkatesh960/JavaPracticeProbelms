//Java Program to Make a Simple Calculator Using switch...case
import java.util.*;
public class calculator {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
       System.out.println("enter the two number ");
        int a=n.nextInt();
        int b=n.nextInt();
        System.out.println("enter the operation to perform \n 1.addiotion \n 2.subtraction \n 3.multiplication \n 4.division ");
        int op=n.nextInt();
        n.close();
        int res=0;
        switch(op)
        { 
            case 1:
             res = a+b;
            System.out.println(a+"+"+b+"="+res);
            break;
            case 2:
             res = a-b;
            System.out.println(a+"-"+b+"="+res);
            break;
            case 3:
            res = a*b;
            System.out.println(a+"*"+b+"="+res);
            break;
            case 4:
            res = a%b;
            System.out.println(a+"%"+b+"="+res);
            break;
            default:
            System.out.println("enter a correct option:");

        }
    }
}
