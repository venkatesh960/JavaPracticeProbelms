public class reverseString {
      public static void main(String[] args)
      {
        String str="venkatesh";
        String str1="";
        /*StringBuffer sb=new StringBuffer();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);*/
        for(int i=str.length()-1;i>=0;i--)
        {
           str1=str1+str.charAt(i);
        }
        System.out.println(str1);
      }    
}
