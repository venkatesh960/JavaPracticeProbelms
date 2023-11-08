//converting to upper to lower or lower to upper case;
public class stringtoggle {
     public static void main(String[] args)
     {
        String str="venkatesh Bottupalli";
        String str1="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                str1=str1+Character.toLowerCase(str.charAt(i));
            }
            else{
                str1=str1+Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(str1);
     }
    
}
