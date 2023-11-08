//prgm to remove space in string
import java.util.*;
public class removespacestring {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a string:");
        String s=sc.nextLine();
        sc.close();
        System.out.println(s.replaceAll("\\s",""));//str_name.repaceAll() is used to remove white spaces..
        //s is for remove tab,newline..etc.,
    }
}
