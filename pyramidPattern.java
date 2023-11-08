public class pyramidPattern {
    public static void main(String[] args) {
        int count=0;
       for(int i=1;i<=5;i++)
       {
        for(int j=5;j>i;j--)
        {
            System.out.print("   ");
        }
        for(int k=1;k<=i;k++)
        {
            
            System.out.print((char)('A'+count)+"  ");
            count++;
        }
        for(int k=2;k<=i;k++)
        {
            System.out.print((char)('A'+count)+"  ");
            count++;
        }
        System.out.println();
    }
    }
    
}
