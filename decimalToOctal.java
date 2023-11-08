//java prgm to decimal to octal(8)..
import java.util.Scanner;
public class decimalToOctal {
    public static void main(String[] args)
    {
      Scanner n=new Scanner(System.in);
      System.out.println("enter a number:");
      int num=n.nextInt();
      n.close();
      int rem=0,res=1;
      while(num>0)
      {
         rem=rem+num%8*res;
        num=num/8;
        res=res*10;
           
      }
       System.out.print(rem);
    }
    
}

