//HashMap is class is same as arraylist but the difference is we will give index of different type(e.g: string)
import java.util.HashMap; 
public class HashMapExample {
    public static void main(String[] args) {
        //create a HashMap class object....
        HashMap<String,String>s1=new HashMap<>();
        //to add the items we use put() method.....
        s1.put("venkatesh", "chiru");
        s1.put("dad", "mom");
        s1.put("akka", "annu");
        s1.put("bava", "atta");
        System.out.println(s1);
        // get() method is used to get the value of particular index..here index is dad
        //key=index, value=items/data....
        System.out.println(s1.get("dad"));
        s1.remove("bava", "atta");
        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.isEmpty());
        // to clear the list....
        s1.clear();
        System.out.println(s1);


        //now we will work on string to int (or) int to string...it is called mapping or instilisation....
        HashMap<String,Integer>s2=new HashMap<String,Integer>();
        s2.put("dad",1);
        s2.put("mom",2);
        s2.put("venkat",3);
        s2.put("chiru",4);
        s2.put("akka",5);
        HashMap<Integer,String>s3=new HashMap<Integer,String>();
        s3.put(1,"dad");
        s3.put(2,"mom");
        s3.put(3,"venkat");
        s3.put(4,"chiru");
        s3.put(5,"akka");
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s3.get(3));
        System.out.println(s2.get("akka")+5);
        System.out.println(s2.get("akka")>s2.get("chiru"));


        
    }
    
}
