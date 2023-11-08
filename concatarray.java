//conacatination of arrau elements
import java.util.Arrays;
public class concatarray {
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        int [] arr2={2,3,5,3,5,34};
        int length=arr1.length+arr2.length;
        int result[]=new int[length];
        int i=0;
        for(int element:arr1)
        {
            result[i]=element;
            i++;
        }
         for(int element:arr2)
        {
            result[i]=element;
            i++;
        }
        /*for(int j=0;j<length;j++)
        {
            System.out.print(result[j]+" ");
        }*/
        System.out.println(Arrays.toString(result));
    }
    
}
//String st = String.valueOf(ch); it is used to converts array of chars to string
//char[] chars = st.toCharArray(); it is used to converts string to char "array" 