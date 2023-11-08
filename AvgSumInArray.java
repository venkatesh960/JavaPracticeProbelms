//average 0f numbers....
import java.util.*;
public class AvgSumInArray {
    public static void main(String[] args)
    {
        Scanner str=new Scanner(System.in);
        System.out.println("enter the no.of array elements:");
        int n=str.nextInt();
        str.close();
        int sum=0;
        int arr[]=new int[n];
        int i,j;
        for(i=0;i<n;++i)
        {
            arr[i]=str.nextInt();
        }
        //str.close();
        for(j=0;j<n;++j)
        { 
            sum=sum+arr[j];
        }
       sum=sum/n;
        System.out.println("the avreage of numbers is:"+(float)sum);
   
    }
    
}
