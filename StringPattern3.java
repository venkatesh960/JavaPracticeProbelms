/*P
PR
PRO
PROG
PROGR
PROGRA
PROGRAM
ARGORP
RGORP
GORP
ORP
RP
P*/
public class StringPattern3 {
    public static void main(String[] args) {
        String s1="PROGRAM";
        int size=s1.length();
        for(int i=0;i<size;i++)
        {
            for(int j=0;j<size;j++)
            {
                if(j<=i)
                {
                    System.out.print(s1.charAt(j)); 
                }
                else{
                System.out.print("  ");
                }
            }
            System.out.println();
        } 
        int size1=size;       
        for(int i=0;i<size;i++)
        {
            for(int j=size1-1;j>=i;j--)
            {
              System.out.print(s1.charAt(j)); 
              size1--;  
            }
            System.out.println();
        }
    }
    
}
