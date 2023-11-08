// A Java program to separate characters and numbers from a string
import java.util.Scanner;
public class CharAndNumberSeparate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with number mix:");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str);
        String chars = "", nums = "";
        for(int i=0;i<str.length();i++){
            if (Character.isLetter(str.charAt(i))) {
                chars += str.charAt(i) + " ";
            }
            else if (Character.isDigit(str.charAt(i))) {
                nums += str.charAt(i) + " ";
            }
        }
        System.out.println(chars);
        System.out.println(nums);
    }
}
