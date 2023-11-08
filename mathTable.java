//java prgm to dispaly maths table
import java.util.*;
public class mathTable {
    public static void main(String [] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("enetr a number:");
        int number=num.nextInt();
        int result=0;
        for(int i=1;i<=10;++i)
        {
            result=number*i;
            System.out.println(number+" * "+i+" = "+result);
        }
        num.close();
    }
    
}
