import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();
        area(l);
        area(l,b);
        area(l,b,h);

    }

    public static void area(int a){
        int square_area = a*a;
        System.out.println("The area of square is "+square_area);
    }

    public static void area(int a, int b){
        int rectangle_area = a*b;
        System.out.println("The area of rectangle is "+rectangle_area);
    }

    public static void area(int a, int b, int c){
        int traingle_area = a*b*c;
        System.out.println("The area of traingle is "+traingle_area);
    }
}