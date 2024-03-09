import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minute: ");
        long m = sc.nextLong();
        System.out.println("Enter the seconds: ");
        long s = sc.nextLong();
        System.out.println("Enter the sec: ");
        long sec = sc.nextLong();
        System.out.println(getDurationString(m,s));
        System.out.println(getDurationString(sec));
    }

    public static String getDurationString(long minute, long seconds){
        if((minute<0) || (seconds>59) || (seconds<0) ){
            return "Invalid Value";
        }
        long hours = minute/60;
        long remainingMinutes = minute%60;
        return hours + "h " + remainingMinutes + "m " + seconds + "s ";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

}