public class Frequencyofchar {
    public static void main(String[] args)
    {
        String str="java";
        char ch[]=str.toCharArray();
        int[] freq=new int[str.length()];
        int i,j;
        for(i=0;i<ch.length;i++)
        {
            freq[i]=1;
            for(j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    freq[i]++;
                    //ch[i]='0';
                }
            }
        }
        for(int k=0;k<ch.length;k++)
        {
            if(ch[k]!='0'&&ch[k]!=' ')
            System.out.println(ch[k]+"-"+freq[k]);
        }
    }
    
}
