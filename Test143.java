/* duplicate string remove input: java output : jav */
public class Test143 {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("java");
        //String s1="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                   str.replace(i, j, "");
                }
            }
            System.out.println(str);
        }
    }
    
}
