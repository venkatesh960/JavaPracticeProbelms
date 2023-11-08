/*Input : 6
Output : Yes, it's a Perfect Number
Since, 6 = 1 + 2 + 3 (which are its divisors)*/
//28=[1,2,4,7,14]
public class perfectnum {
         public static void main(String[] args)
         {
            int num=25;
            int sum=0;
            int temp=num;
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    sum=sum+i;
                }
            }
            if(sum==temp)
            {
                System.out.println("perfect:");
            }
            else
            {
                System.out.println("not perfect");
            }

         }    
}
