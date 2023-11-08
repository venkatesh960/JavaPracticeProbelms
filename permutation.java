import java.util.*;
public class permutation {
    public static void main(String[] args)
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("enter no.people: ");
      int n=sc.nextInt();
      System.out.println("enter no.ways:");
      int r=sc.nextInt();
      sc.close();
      int num=n-r;
      int fact1=fact(n);
      int fact2=fact(num);   //n!/(n-r)!
      int p=fact1/fact2;
      System.out.println(p+" ways we can arrenge ");
    }
    static int fact(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;      
        }
        return fact;
    } 
}
