
public class stringpalindrome {
    public static void main(String[] args)
    {
       String str="AmmA";
       String temp="";
       for(int i=str.length()-1;i>=0;i--)
       {
         temp=temp+str.charAt(i);
       }
       if(str.equals(temp))
       {
        System.out.println("palindrome = "+temp);
       }
       else{
        System.out.println("not a palindrome = "+temp);
       }
    }
    
}
