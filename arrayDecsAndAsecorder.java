import java.util.*;
class arrayDescAndAsecorder{
    public static void main(String[] args)
    {
        int arry[] ={1,2,32,43,12,83,23};
        Arrays.sort(arry);
        int n=arry.length;
        for(int i=0;i<n/2;i++)
        {
            System.out.print(arry[i]+" ");
        }
        for(int i=n-1;i>=n/2;i--)
        {
            System.out.print(arry[i]+" ");
        }
        
    }
}