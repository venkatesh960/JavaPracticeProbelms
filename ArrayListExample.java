import java.util.ArrayList;
import java.util.Collections;
public class ArrayListExample {
    public static void main(String[] args)
    {
        //creating an empty array list....
        ArrayList<Integer>arr1=new ArrayList<Integer>();
        //now assigning value to arr1 list..
        for(int i=1;i<=5;i++)
        {
            arr1.add(i);
        }
        System.out.println(arr1);
        arr1.add(1,49);
        System.out.println(arr1);
        //to upadte or modifi the value ....we can use set()method....
        arr1.set(1,69);
        System.out.println(arr1);
        // to remove an element we use remove() method..
        arr1.remove(0);
        System.out.println(arr1);
        //to sort the arr1 list we use Collection.sort() method...
        Collections.sort(arr1);
        System.out.println(arr1);
        // to get a value from the list we use get() method...
        System.out.println(arr1.get(0));

        //to find the size if the arr1 list we use arr1.size() method...
        System.out.println(arr1.size());

        //forexample if we created two array list namely arr1 and arr2 we we want to add all items present int the arr2 into arr1 
        //we use addAll() method...
        ArrayList<Integer> arr2=new ArrayList<Integer>(); 
        ArrayList<Integer> arr3=new ArrayList<Integer>();
        for(int i=0;i<=5;i++)
        {
            arr2.add(i);
        }
        System.out.println("arr2="+arr2);
        arr3.addAll(arr2);
        //or we arguments like arr3.addAll(from,arr2);
        System.out.println("arr3="+arr3);
        arr3.addAll(3, arr2);
        System.out.println(arr3);
        //to clear the all the element in the array list we use clear() method...
        arr3.clear();
        System.out.println(arr3);
        //contains() method is used to return boolen value if value is present in retuns true;

        //to get position we use ArrayList.indexOf(value);
        System.out.println(arr3.indexOf(3));
        //The retainAll() method of ArrayList is used to remove all the array list’s elements
        // that are not contained in the specified collection
        ArrayList<String> s1=new ArrayList<String>();
        s1.add("venkatesh");
        s1.add("chiru");
        s1.add("nana");
        s1.add("akka");
        s1.add("amma");
        s1.add("alludu");
        ArrayList<String>s2=new ArrayList<String>();
        s2.add("akka");
        s2.add("bava");
        s2.add("alludu");
        s2.add("athha");
        s1.retainAll(s2);
        System.out.println(s1);
        //to convert arralList int array we use...toArray() method....
        String[] str=new String[s1.size()];
        str=s2.toArray(str);
        for(String s:str)
        System.out.println(s);

        //to convert array into ArrayList....we use follow method
        int arr[]={1,2,3,65,42,55,2,3,2};
        ArrayList<Integer>a1=new ArrayList<Integer>();
        for(Integer i:arr)
        {
            a1.add(i);
        }
        System.out.println(a1);
        

    }
    
}
