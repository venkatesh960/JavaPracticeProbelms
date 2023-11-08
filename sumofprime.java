//prgm to find sum of even numbers//
//14=11+3//
//import java.util.*;//
public class sumofprime {
    public static void main(String[] args)
    {
        int num=15;
        int x=0;
        for(int i=2;i<=num;i++)
        {
            if(checkprime(i)==1)
            {
                if(checkprime(num-i)==1)
                {
                    System.out.println(num+"="+i+"+"+(num-i));
                    x=1;
                }
            }
        }
        if(x==0)
            {
              System.out.println("not possible");
            }
    }
    static int checkprime(int num)
    {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                ++count;
            }
            else
            {
                continue;
            }
        }
        if(count==1)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
}
