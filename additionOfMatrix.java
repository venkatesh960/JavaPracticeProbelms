//Java Program to Add Two Matrix Using Multi-dimensional Arrays
import java.util.Scanner;
public class additionOfMatrix {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter no. of rows:");
        int row=n.nextInt();
        System.out.println("enter no. of colums:");
        int col=n.nextInt();
        int arr[][]= new int[row][col];
        int brr[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("enter 1sr array elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=n.nextInt();
            }
        }
        System.out.println("enter 2nd array elements: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                brr[i][j]=n.nextInt();
            }
        }
        n.close();
        for(int i=0;i<row;++i)
        {
            for(int j=0;j<col;++j)
            {
                sum[i][j]=brr[i][j]+arr[i][j];
            }
        }
        System.out.println("the sum of arry elements are:");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+" ");
            }
            System.out.print("\n");
        }
        /*for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");                      //this prgm for transpose matrx
        }
        System.out.println("the transpose matrix is : ");
        for (int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.print("\n");
        }*/
    }
    
}
