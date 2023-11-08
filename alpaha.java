//prgm for alpahabets...
import java.util.*;
public class alpaha {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an character: ");
        char c=obj.next().charAt(0);
        obj.close();
if(Character.isLetter(c))
{
    System.out.println("it is a alphabet="+c);
}
else
{
    System.out.println("not a alphabet="+c);
}
/*if((c>='A' && c<='Z')||(c>='a' && c<='z'))
{
    System.out.println("alphabet...");
}
else{
    System.out.println("not alphabet..");
}*/
    }
    
}
