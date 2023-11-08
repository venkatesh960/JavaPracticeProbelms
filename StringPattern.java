/*String =PHYSICS
   P
   H
   Y
PHYSICS
   I
   C
   S*/
   import java.util.Scanner;
public class StringPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string :");
        String s1=sc.nextLine();
        sc.close();
        int size=s1.length();
        char ch[]=s1.toCharArray();
        for(int i=0;i<=size/2;i++)
        {
            System.out.println(ch[i]);
        }
        System.out.println(s1);
        for(int j=size/2+1;j<size;j++)
        {
            System.out.println(ch[j]);
        }
    }
    
}
