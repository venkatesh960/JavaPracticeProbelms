//Java Program to Count the Number of Vowels and Consonants in a Sentence
import java.util.*;
public class noVowelsConstants {
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the statement:");
        String s=n.nextLine();
        String s1=s.toLowerCase();
        int con=0;
        int vow=0,space=0;
        n.close();
        for(int i=0;i<s1.length();++i)
        {
        char ch=s1.charAt(i);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            ++vow;
        }
        else if(ch>='a'&&ch<='z')
        {
            ++con;
        }
        else if(ch==' ')
        {
            ++space;
        }
    }
        System.out.println("the number os vowels is:"+vow);
        System.out.println("the number is constants is:"+con);
        System.out.println("the number is spaces is:"+space);         
    }
}
