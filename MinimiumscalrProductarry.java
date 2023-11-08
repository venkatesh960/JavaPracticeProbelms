/*Input :arr1[4] = [10, 30, 40, 20]
            arr2[4] = [2, 4, 5, 1]
Output : 230
Explanation : 10*5 + 20*4 + 30*2 + 40*1 = 230*/
import java.util.Arrays;
import java.util.Collections;
class MinimumscalrProductarry{
    public static void main(String[] args)
    {
      Integer arr[]={10, 30, 40, 20};
      Integer a[]={2,4,5,1};
      int product=0;
      Arrays.sort(arr);
      Arrays.sort(a, Collections.reverseOrder());
      /*for(int i=0;i<arr.length;i++)
       {
        temp[j-1]=arr[i];
        j=j-1;
       }
      for(int i:a)
      {
        System.out.print(i+" ");
      }*/
      for(int i=0;i<arr.length;i++)
      {
        product=product+arr[i]*a[i];
      }
      System.out.println(product);
    }
}