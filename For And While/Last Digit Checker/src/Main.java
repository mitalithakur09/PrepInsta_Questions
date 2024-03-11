import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int m = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n = sc.nextInt();
        System.out.println("Enter the third number: ");
        int o = sc.nextInt();
        System.out.println(lastDigitChecker(m,n,o));
    }
    public static boolean lastDigitChecker(int a, int b, int c){
        boolean answer = false;
        int righta = a%10;
        int rightb = b%10;
        int rightc = c%10;
        if(a>10 && b>10 && c>10) {
            if (righta == rightb || rightb == rightc || rightc == righta) {
                answer = true;
            }
        }
        return answer;
    }
}