public class fibanc {
    public static void main(String[] args)
    {
        int n=10,i=1,first=0,second=1;
        System.out.println("first"+n+" fibanacci series are:");
        while(i<=n)
        {
            System.out.printf(first+" ");
            int next_term=first+second;
            first=second;
            second=next_term;
            ++i;
        }

    }
    
}
