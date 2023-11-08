import java.util.Scanner;

public class stringLastWordePrint {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string :");
        String str=sc.nextLine();
       String str1=str.trim();
       System.out.println(str1);
        String[] str3= str1.split("\\s");
        System.out.println(str3[str3.length-1]); 
        sc.close();

    }
    
}
