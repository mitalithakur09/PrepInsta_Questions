import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        calculateThePythagorean(a, b, c);
    }
    public static void calculateThePythagorean(int a, int b, int c){
        int p = a*a;
        int q = b*b;
        int r = c*c;
        if((p+q)==r){
            System.out.println("Pythagorean Triplet");
        }
        else{
            System.out.println("Not a pythagorean triplet");
        }
    }

}