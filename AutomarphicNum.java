/*Input : 5
Output : 25
Explanation : Number = 5
when squared you get 25
as 25 ends with 5*/
public class AutomarphicNum {
    public static void main(String[] args)
    {
       int num=25;
       int temp=check(num);
       int sqr=num*num;
       int temp1=check1(sqr,temp); 
       if(temp==temp1)
       {
        System.out.println("automarphic number");
       }
       else
       {
        System.out.println("not automarphic");
       }
    }
    static int check(int num)
    {
        int sum=0;//num=25
        while(num>0)//25>0,2>0
        {
            int rem=num%10;//5,2
            sum=sum+rem;//5+0,5+2
            num=num/10;//2,0
        }
        return sum;//7
    }
    static int check1(int sqr,int temp)//625,7
    {
        int sum=0;
        while(sqr>0)//625>0,62>0
        {
            int rem=sqr%10;//5,2
            sum=sum+rem;//0+5,0+5+2
            if(temp==sum)//7==5,7==7
            {
                return sum;//7
            }
            sqr=sqr/10;//62,
        }
        return 0;
    }
}
/*public class Main {
public static void main(String[] args) {
    int x=5;
    int y=x*x;                   //another method.....
    if(y%10==x%10)
        System.out.println("automorphic");
    else
        System.out.println("not");
}
}*/