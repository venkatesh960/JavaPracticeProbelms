import java.util.*;
public class printfrequencyElement {
    public static void main(String[] args)
    {
        int arr[] ={10, 30, 50, 20, 10, 20, 30, 10};
        Arrays.sort(arr);
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println("\n");
        int count=1;
        int temp[]=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
          temp[i]=arr[i];
          count=1;
          for(int j=i+1;j<arr.length;j++)
          {
              if(temp[i]==arr[j])
              {
                  count++;
              }
          }
          System.out.println(arr[i]+" "+count);
        }
    }
    
}
