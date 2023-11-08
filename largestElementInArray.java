/*Java Program to Find Largest Element of an Array*/
public class largestElementInArray {
    public static void main(String[] args)
    {
       int array[]={100,500,304,700,304,504};
       int large=array[0];
      for(int i:array)
      {
          if(large<i)
          {
            large=i;
          }
      }
      System.out.println(large);
    }
    
}
