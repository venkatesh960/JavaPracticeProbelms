/*Input : 145
Output : Yes, it's a strong number
Explanation : Number = 145
145 = 1! + 4! + 5!
145 = 1 + 24 + 120
output number  = 145.*/
public class strongnum {
    public static void main(String[] args)
    {
        int n=145;
        int temp=n;
        int rem,sum=0;
        while(n!=0)
        {
           rem=n%10;
           sum=sum+fact(rem);
            n=n/10;
        }
        if(temp==sum){
        System.out.println("it is a strong number:");
        }
        else{
            System.out.println("it is not a strong number:");
        }
    }
    static int fact(int num)
    {
        int fact=1;
    for(int i=1;i<=num;i++)
    {
        fact=fact*i;
    }
        return fact;
    }
}
