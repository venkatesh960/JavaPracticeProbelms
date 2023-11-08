/*if the input string is "Java" the string return 'a' */

import java.util.Arrays;

public class MaximumFrequencyOfString {
    public static void main(String[] args) {
        String str="venkatesh";
        char[] ch=str.toCharArray();
        int small=1;
        Arrays.sort(ch);
        for(char i:ch)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i=0;i<ch.length;i++)
        {
            int count=1;
           int large=1;
            while(i<ch.length-1 && ch[i]==ch[i+1])
            {
                count++;
                i++;
                large++;
                small++;
            }
            if(small<=large)
            {
                System.out.println(ch[i]+" : "+count);
            }

        }
    }
}
