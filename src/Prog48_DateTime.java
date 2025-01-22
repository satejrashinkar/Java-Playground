import java.util.Date;

public class Prog48_DateTime {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println("Years passed since 1 Jan 1970 : " + (System.currentTimeMillis()/1000/3600/24/365));
        System.out.println("Days passed since 1 Jan 1970 : " + (System.currentTimeMillis()/1000/3600/24));

        Date d = new Date();
        System.out.println("Date : " + d);
        System.out.println("getTime() : " + d.getTime());
        System.out.println("getDate() : " + d.getDate());
        System.out.println("getDay() : " + d.getDay());
        System.out.println("getSeconds() : " + d.getSeconds());
        System.out.println("getYear() : " + d.getYear() + 1900);
    }
}