/*Input : arr[8] = [10, 20, 40, 30, 50, 20, 10, 20]
Output : 40 30 50
Explanation : 40, 30 and 50 are occur 1 time in the given array, 10 occurs 2 times and 20 occurs 3 times.*/
import java.util.*;
public class printNonRepeatingarry {
    public static void main(String[] args)
    {
        int arr[] = {10, 20, 40, 30, 50, 20, 10, 20};
        Arrays.sort(arr);
        //for(int i:arr){
        //System.out.print(i+" ");}
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            while(i<arr.length-1 && arr[i]==arr[i+1])
            {
            count++;
            i++;
            }
           // System.out.println(arr[i]+": "+count);
            //System.out.println("\n");
            if(count==1)
            {
            System.out.print(arr[i]+" ");
            }
        }
    }
    
}
