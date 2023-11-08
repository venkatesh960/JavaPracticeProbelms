/*Consider two strings elbow and below
Both the strings have the same length
Both the strings have same letters
But the letters are re-arranged in a way to form two different words*/
import java.util.Arrays;
public class anargramString {
    public static void main(String args[])
    {
        String str1="elbow";
        char ch1[]=str1.toCharArray();
        String str2="below";
        char ch2[]=str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
            System.out.println("anagram ");
        }
        else{
            System.out.println("not an anagram string");
        }
        
    }
    
}
