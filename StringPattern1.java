/*P
PR
PRO
PROG
PROGR
PROGRA
PROGRAM*/
public class StringPattern1 {
    public static void main(String[] args) {
        String s1="PROGRAM";
        int size=s1.length();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(s1.charAt(j));
            }
            System.out.println();
        }
    }
    
}
