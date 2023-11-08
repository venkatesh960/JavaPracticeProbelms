/*arr[] = [101, 200, 301, 400, 501]
Even Elements count = 2 (200, 400)
Odd Elements count = 3 (101, 301, 501)*/
//import java.util.*;
public class NumOfEvenOddArray {
    public static void main(String[] args)
    {
        int arr[]={101, 200, 301, 400, 501};
        int count=0,temp=0;
        for(int i=0;i<arr.length;i++)
        {
          if(checkeven(arr[i]))
          {
            count++;
            System.out.print(arr[i]+"  ");
          }
          else{
            temp++;
          }
        }
        System.out.println("= "+count+" number of evens");
        System.out.println(temp+" number of odds");
    }
    static boolean checkeven(int a)
    {
        if(a%2==0)
        {
        return true;
        }
        else{
            return false;
        }
    }
    
}
