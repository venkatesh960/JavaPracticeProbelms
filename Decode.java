/*Sequence = 131
Possible decoding (1, 3, 1,)    = ACA
Possible decoding (13, 1)   = MA
So, the total possible decoding’s of sequence 131 is 2.*/
class Decode {
    public static void main(String[] args)
    {
        String s="1212";
        char[] ch=s.toCharArray();
        int n=ch.length;
        int poss=countdecode(ch,n);
        System.out.println("no of posiible ways we can arrenge is "+poss);
    }
    static int countdecode(char[] ch,int num)
    {
        int arr[]=new int[num+1];
        arr[0]=1;
        arr[1]=1;
        for(int k=2;k<=num;k++)
        {
            arr[k]=arr[k-1];
            if(ch[k-2]=='1'||(ch[k-2]=='2' && ch[k-1]<'7'))
            {
                arr[k]=arr[k]+arr[k-2];
            }

        }
      return arr[num];
    }
}
