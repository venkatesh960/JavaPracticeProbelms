/*Input : Number = 18
Output : Yes, It's an Abundant Number
Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.
It's an abundant number.*/
public class abudantnum {
    public static void main(String[] args)
    {
        int num=18;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
                if(sum>num)
                {
                    System.out.println("abudant number:"+sum);
                }
                else{
                    System.out.println("not abudant number:");
                }
        }
    }
