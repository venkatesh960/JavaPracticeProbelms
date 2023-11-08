/*P
PR
PRO
PROG
PROGR
PROGRA
PROGRAM
PROGRA
PROGR
PROG
PRO
PR
P*/
public class StringPattern2 {
    public static void main(String[] args) {
        String s1="PROGRAM";
        int size=s1.length();
        int star=1;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<star;j++)
            {
                System.out.print(s1.charAt(j));
            }
            star++;
            System.out.println();
        }
        int star1=size;
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<star1-1;j++)
            {
                System.out.print(s1.charAt(j));
            }
            star1--;
            System.out.println();
        }
    }
    
}
