import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class ToGetRealDateAndTime {
    public static void main(String[] args) {
        LocalDateTime mydate=LocalDateTime.now();//to get date and time  both
        System.out.println("display local date "+mydate);
        //to get only time................................
        LocalTime myTime=LocalTime.now();
        System.out.println("dispaly local time "+myTime);
        // to get only date.......................
        LocalDate myDate=LocalDate.now();
        System.out.println(myDate);
        // to get formatted date and time........
        DateTimeFormatter myFormatted=DateTimeFormatter.ofPattern("E, MMM dd yyyy hh-mm-ss");
        String s1=mydate.format(myFormatted);
        System.out.println("formatted date and time "+s1);
        // to get time formatter....
        DateTimeFormatter myTime1=DateTimeFormatter.ofPattern("h:mm:ss");
        String s2=myTime.format(myTime1);
        System.out.println("formatted time "+s2);
        int s3=myDate.getDayOfMonth();
        System.out.println(s3);
        System.out.println(myDate.getDayOfWeek());


        // example...
        LocalDate d2=LocalDate.of(2001, 06, 19);
        System.out.println(d2.getDayOfWeek());

    }
    
}
