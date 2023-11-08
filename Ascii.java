//Java Program to Find ASCII Value of a character
/*The ASCII value of lowercase alphabets are from 97 to 122. 
And, the ASCII value of uppercase alphabets are from 65 to 90*/ 

/*we have used the \*isAlphabetic()*\ method of the \*Character*\ class*/
import java.util.*;
public class Ascii {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=obj.next().charAt(0);
        //int x=ch;
        System.out.println((int)ch); //type cast method....
        obj.close();
    }
    
}
