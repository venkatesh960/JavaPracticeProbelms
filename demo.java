/* Online Java Compiler and Editor */
public class demo{
     public static void main(String []args){
     int digit=12;
     int bin=0;
     int count=0;
     while(digit>=0)
     {
         int rem1=digit%2;
         bin=rem1*(int)Math.pow(10,count)+bin;
         count++;
         digit=digit/2;
     }
     System.out.println(bin);
     }
}