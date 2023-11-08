//to Print an Integer entered by an user
import java.util.Scanner;
class hello{
public static void main(String[] args){
    Scanner obj=new Scanner(System.in);
    System.out.println("enter a number");
    int x=obj.nextInt();
    System.out.println("enter a string ");
    String y=obj.nextLine();
    y=y+obj.nextLine();//or we can inistialis like String z=obj.nextLine();
    System.out.println(x+" the string is "+y);
    obj.close();
}
}