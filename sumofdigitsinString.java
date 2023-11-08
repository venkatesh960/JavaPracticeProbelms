
public class sumofdigitsinString {
    public static void main(String[] args)
    {
        String str="ven3bakstr4 sjsh2jdkj4";
        int sum=0;
        /*for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))                 or we can do as follow
            {
                sum=sum+Character.getNumericValue(str.charAt(i));
            }
        }*/
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum=sum+ch-'0';  //So string.charAt(i) - '0' converts it to an integer
            }
        }
        System.out.println(sum);
    }

}