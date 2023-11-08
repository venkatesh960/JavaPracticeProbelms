//palindrome...
import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = scanner.nextInt();
        scanner.close(); 
        int original = num;
        int reversed = 0;
        int rem;
        
        while (num > 0) {
            rem = num % 10;
            reversed = reversed * 10 + rem;
            num = num / 10;
        }
        
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
