//if the input string is "Java";
/* j=1
 * a=2
 * v=1
 */
import java.util.Arrays;

public class FrequencyOfString {
    public static void main(String[] args) {
        String s1="java";
        char[] ch=s1.toCharArray();
        Arrays.sort(ch);
        System.out.println("size of array is :"+ch.length);
        for(char i:ch)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<=ch.length-1;i++)
        {
            int count=1;
            while(i<ch.length-1 && ch[i]==ch[i+1])
            {
                count++;
                i++;
            }
            System.out.println(ch[i]+": "+count);
        }
    }

    
}
