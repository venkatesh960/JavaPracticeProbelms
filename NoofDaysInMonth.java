public class NoofDaysInMonth {
    public static void main(String[] args)
    {
        int month=1,year=2021;
        if(year<=9999)
        {
        if(month==2)
        {
            if(year%4==0||year%400==0 && year%100==0)
            {
                System.out.println("number of days are 28");
            }
            else{
                System.out.println("Number of days are 29");
            }
        }
        else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            System.out.println("number of days are 31");
        }
        else if(month==4||month==6||month==9||month==11)
        {
            System.out.println("number of days are 30");
        }
        else
        {
            System.out.println("Invalid month");
        }
    }
    else{
        System.out.println("Invalid year:");
    }
    }
    
}
