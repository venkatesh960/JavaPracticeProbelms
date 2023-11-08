public class DuplicateString {
    public static void main(String[] args) {
        String org="tamata";
        String dup="";
        for(int i=0;i<org.length()-1;i++)
        {
            int count=1;
            for(int j=i+1;j<org.length();j++)
            {
                if(org.charAt(i)==org.charAt(j))
                {
                    dup=dup+org.charAt(i);
                    count++;
                }
            }
            System.out.println(count+"="+org.charAt(i));
        }

    }
    
}
