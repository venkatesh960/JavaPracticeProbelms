public class removeDuplicatecharInString {
    public static void main(String[] args)
    {
        String s1="madamm";
       String result=removeRepeatedChar(s1);
       System.out.println("s1 : "+s1);
       System.out.println("result : "+result);
    }
    static String removeRepeatedChar(String s2)
    {
        String result="";
        String repeatedchar="";
        for(int i=0;i<s2.length();i++)
        {
            char current_char=s2.charAt(i);
            boolean repeated=false;
            for(int j=i+1;j<s2.length();j++)
            {
               if(current_char==s2.charAt(j))
               {
                repeated=true;
                repeatedchar=repeatedchar+current_char;
                break;
               }
            }
            if(!repeated)
            {
                result=result+current_char;
            }
        }
        System.out.println(repeatedchar);
        return result;
    }
    
}
