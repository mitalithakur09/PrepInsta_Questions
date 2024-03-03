import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The kilobyte is: ");
        int n = sc.nextInt();
        megaByte(n);
    }
    public static void megaByte(int kilobyte){
        if(kilobyte<0){
            System.out.println("The invalid input.");
        }
        else{
            int megabyte = kilobyte/1024;
            System.out.println("The megabyte is: "+megabyte);
        }
    }

}   