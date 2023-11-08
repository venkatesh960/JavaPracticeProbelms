public class zerosToOnes {
    public static void main(String[] args)
    {
        int num=120008234;
        char[] ch=String.valueOf(num).toCharArray();//first it converts to string and than it converts to char array..
        //String ch=Integer.toString(num); used to convert int to string
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0')
            {
                ch[i]='1';
            }
        }
        //String str=new String(ch);
        // or
       // String.valueOf(ch);
        //System.out.println(str+2);
        //Integer num1=Integer.valueOf(str);
        //System.out.println(num1+1);   //roll back conditions...
        for(int i=0;i<ch.length;i++)
        System.out.print(ch[i]+" ");
    }
    
}
