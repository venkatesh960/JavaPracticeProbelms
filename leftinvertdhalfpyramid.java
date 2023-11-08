//java prgm to print invertyed half pyramid
public class leftinvertdhalfpyramid {
    public static void main(String[] args)
    {
        int row=5,col=5;
        for(int i=1;i<=row;i++)
        {
            for (int j=i;j<=col;j++)
            {
                System.out.print(" * ");
            }
            System.out.println("\n");
        }
    }
    
}