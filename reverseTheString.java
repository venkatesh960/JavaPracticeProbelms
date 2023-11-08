//java prgm to revesre the string.....
import java.util.*;
public class reverseTheString {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enetr a string:");
        String s1=n.nextLine();
        n.close();
        for(int i=(s1.length()-1);i>0;--i)
        {
            char ch=s1.charAt(i);
            System.out.print(ch);
        }

    }
    
}
