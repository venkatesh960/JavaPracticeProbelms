public class javaInheritance {
    int z=89;
    public void addition(int x,int y)
    {
        int z=x+y;
        System.out.println(z);
    }
    public void subtraction(int x,int y)
    {
        int z=x-y;
        System.out.println(z);
    }
    public void multiplication(int x,int y){
        int z=x*y;
        System.out.println(z);
    }
}//class ends of first class....
    class myclass extends javaInheritance{//second class starts....
        int z=10;
        public void mymethod(String name)
        {
            javaInheritance obj2=new javaInheritance();
            System.out.println(name);
         obj2.multiplication(5,10);
        }
        public static void main(String[] args)
        {
            myclass obj=new myclass();
            obj.addition(10,20);
             obj.subtraction(10,20);
              obj.multiplication(10,20);
               obj.mymethod("venkatesh");
               System.out.println(obj.z);

        }
    }
//https://www.tutorialspoint.com/java/images/types_of_inheritance.jpg  for java inhertinace...