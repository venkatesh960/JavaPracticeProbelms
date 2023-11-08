//prgm to print prime nu.without modulos and division...
class evenNumLogic
{
    public static void main(String args[])
    {
        int num=1258490;
        if(even(num))
        {
            System.out.println("even");
        }
        else{
            System.out.println("not even:");
        }
    }
    static boolean even(int num)
    {
       int n=num&1;
       if(n==1)
       {
        return false;
       }
       else{
        return true;
    }
/*String s=(num%2==0)?"even":"not evne";
System.out.println(s);*/  //using ternary operator:
}
}