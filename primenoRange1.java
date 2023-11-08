//java prgm to find range of prime numbers 
public class primenoRange1 {
    public static void main(String[] args)
    {
        int num=100;
        for(int i=2;i<=num;i++)
        {
            if(checkprime(i))
            {
                System.out.print(i+" ");
            }
        }
        
    }
    static boolean checkprime(int num)
    {
        int count=0;
        for(int i=2;i<=num;i++)
        {
            if(num%i==0)
            {
                ++count;
            }
            else{
                continue;
            }
        }
        if(count==1)
                return true;
        else{
            return false;
        }
    }
    
}//i will do it later....
