//Sort Strings in Dictionary Order
import java.util.*;
public class sortString {
    public static void main(String[] args)
    {
        String[] s={"venkat","chiru","dad","mom","sista","alludu"};
        for(int i=0;i<=5;++i)
        {
            for(int j=i+1;j<=5;++j)
            {
                if(s[i].compareTo(s[j])>0)
                {
                  String swap=s[i];
                  s[i]=s[j];
                  s[j]=swap;
                }
            }
        }
        for(int i=0;i<=5;++i)
        {
            System.out.println(s[i]);
        }
        System.out.println("\n");
       Arrays.sort(s);
       for(String i:s)
       {
        System.out.print(i+" ");
       }
    }
    
}
