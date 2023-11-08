//java prgm to factors of a number....
import java.util.*;
public class factors {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=n.nextInt();
        int x=-45;
        int y=Math.abs(x); //this function is used to return the absloute value;
        System.out.println(y);
        n.close();
        if(num>0)
        {
            for (int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
    
}
