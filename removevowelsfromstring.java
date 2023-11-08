import java.util.*;
public class removevowelsfromstring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string ");
        String str=sc.nextLine();
        sc.close();
        String str1=str.replaceAll("[^aeiou]","");
        System.out.println(str1);
    }
    
}
