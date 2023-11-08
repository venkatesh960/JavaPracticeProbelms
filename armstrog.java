//Java Program to Check Armstrong Number 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.(1*1*1+5*5*5+3*3*3=153)
import java.util.Scanner;
public class armstrog {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter a number");
        int num=n.nextInt();
        n.close();
       while(num>=0)
        {
            if(checkarmstrong(num))
            {
                System.out.print(num+" ");//for range of armstrong nums
            }
            num--;
        }
       /* while(num>=1)
        {
           rem=num%10;
           num=num/10;                    this is for to check only that number
           sum=sum+rem*rem*rem;
        }
        if(sum==temp)
        {
            System.out.println("it is armstrong:"+sum);
        }
        else{
            System.out.println("no its not armstrong: "+sum);
        }*/

    }
    static boolean checkarmstrong(int num)
    {
        int sum=0;
        int rem=0,temp=num;
        while(num>=1)
        {
           rem=num%10;
           num=num/10;
           sum=sum+rem*rem*rem;
        }
        if(sum==temp)
        {
            return true;
        }
        else{
            return false;
        }

    }
    
}
