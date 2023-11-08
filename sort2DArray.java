
import java.util.Arrays;

class sort2DArray{
    public static void main(String args[])
    {
        int mat[][]={{1,2,30},{23,55,67},{37,81,90}};
        System.out.println(mat.length);
        int[] arr=new int[9];
        int x=0;
        for(int i=0;i<mat.length;i++)
        {
           for(int j=0;j<mat.length;j++)
           {
            arr[x]=mat[i][j];
            x++;
           }
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}