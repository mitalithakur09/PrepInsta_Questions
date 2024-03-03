// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        boolean response = shouldWakeup(true, 9);
        System.out.println(response);
    }

    public static boolean shouldWakeup(boolean barking, int hourofday) {
        if (hourofday >= 1 && hourofday <= 23) {
            if ((barking == true) && (hourofday < 8 || hourofday > 22)) {
                return true;
            }
            else {
                return false;
            }
        }
           else{
               return  false;

        }
    }

}