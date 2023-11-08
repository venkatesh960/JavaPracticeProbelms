public class handshek {
    public static void main(String[] args)
    {
        int n=5;
        int sum=0;
        while(n>=0)
        {
            int i=1;
            n=n-i;     //or use this formula n*(n-1)/2;
            sum=sum+n;
        }
        System.out.println("the no.of handshake is "+(sum+1));
    }
    
}
