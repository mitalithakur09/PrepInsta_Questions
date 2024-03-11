import javax.swing.plaf.synth.SynthScrollPaneUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int c = sc.nextInt();
        perfectNumber(c);
    }
    public static void perfectNumber(int a){
        int sum = 0;
        int b = a;
        for(int i =1; i<a; i++){
            if(a%i==0){
                sum = sum+i;
                System.out.println(sum);
            }
        }
        if(b==sum){
            System.out.println("The number is a perfect number");
        }
        else{
            System.out.println("The number is not a perfect number");
        }
    }
}