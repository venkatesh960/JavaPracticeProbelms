public class removespaceinStrin {
    public static void main(String[] args)
    {
        String str="       venkatesh chiru nana amma    ";
        //str=str.trim();//it removes space from end and first of the string...
        str=str.replaceAll("\\s","");
        System.out.println(str);
    }
    
}
/*import java.util.*;

public class removespaceinStrin {
      public static void main(String[] args) {
      StringBuffer sb = new StringBuffer();
	String s = "   Prepinsta is best   ";
	String[] s1 = s.split("[\\s]");
	for (String string : s1) {
		sb.append(string);                 //   next method....
	}
    System.out.println(sb);
   }
}*/