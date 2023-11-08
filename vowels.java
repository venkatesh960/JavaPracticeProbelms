//Java Program to Check Whether an Alphabet is Vowel or Consonant
import java.util.*;
public class vowels {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a character:");
        String str=obj.next();
        char ch=str.charAt(0);
        obj.close();
        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            System.out.println("enterd vowel = "+ch);
            break;
            default:
            System.out.println("you have not enterd a voewl:"+ch);
        }

    }
}
