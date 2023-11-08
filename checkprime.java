//checking prime or not
import java.util.*;
public class checkprime {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter a number: ");
        int num=n.nextInt();
        n.close();
        int count=0;
        int i=1;
       for(i=1;i<=num;++i)
       {
        if(num%i==0)
        {
        ++count;
        }
       }
          if(count==2)
          {
            System.out.println("the number is prime: "+num);
          }
          else{
            System.out.println("not an prime number: "+num);
          }
    }
}
