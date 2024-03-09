import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the minutes: ");
        long minutes = sc.nextLong();
       minuteToDays(minutes);
    }

    public static long minuteToDays(long m){
        if(m<0){
            System.out.println("The value is invalid");
        }
        else {
            long years = m / 525600;
            long remainingMin = m - (years *525600);
            long days = remainingMin / 1440;
            System.out.println("Years "+years+" Days "+days+" Minutes "+remainingMin);
        }
        return 0;

    }

}