//import java.util.*;
public class stringOperations {
    public static void main(String[] args)
    {
        String s1="venkat ",s2="chiru",s3="dad is my hero";
        String str="venkates jdhd odsf odji";
        int size1=str.length();
        System.out.println(size1);
        String str1[]=str.split("\\s");
        int size2=str1.length;
        System.out.println(Integer.toString(size2));
        //String str1=s3.substring(0,5);
        //boolean str=s3.contains("is");
        //int result=s1.compareTo(s2);
        //String re=s1.concat(s2);
        //System.out.println(result);
        for(String i:str1)
        {
            System.out.println(i+" ");
        }
        String s=String.join(" ",s2,s3,s1,s3);
        System.out.println(s);
    }
    
}
//str.codePointAt(+ve value and less than the size of string) it return ascii value of charcater
//str_name=Integer.toString(int_value); it is helpful convert int to string
//str_name.length();
//str_name1.compareTo(str_name2);
//str_name1.concat(str_name2);
//str_name1.joins("joint_word","str1","str2");
//contains() check wether the string is present are not....
//String str1=s3.substring(from(compulsory),to(optional)); it has max.two arguments and last one optinal and first one compulsory...
//https://www.programiz.com/sites/tutorial2program/files/java-string-substring.png  for substring
// StringBuilder sb=new StringBuilder();
        // sb.append(str);
        // sb.reverse();//for reverse the string...
