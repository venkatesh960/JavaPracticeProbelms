 //prime factoes of a number eg:12=2*2*3=12;    
//import java.util.*;
 class primefactors {
    public static void main(String args[])
    {
        int num=90;
        int i=2;
        while(true)
        {
        while(num%i==0)
        {
            int x=i;
            System.out.print(x+" ");
            i=x;
            num=num/i;
        }
        if(num==0||num==1)
        {
            break;
        }
        ++i;
        }
    }
}

   