public class javaOveriding {
    public void animal()
    {
        System.out.println("the animal method ");
    }
}
 class dog extends javaOveriding{
    public void animal()
    {
        System.out.println("the animal is dog method...");
    }
public static void main(String[] args)
{
   javaOveriding d=new dog();
   javaOveriding j=new javaOveriding();
   d.animal();
   j.animal();

}
}

