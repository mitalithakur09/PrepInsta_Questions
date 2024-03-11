import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int digit = sc.nextInt();
        int sum = 0;
        do{
            int rem = digit%10;
             sum = sum+rem;
            digit = digit/10;
        }
        while (digit!=0);
        System.out.println(sum);
    }
}