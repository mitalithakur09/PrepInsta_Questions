import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    calcultaor();

    }

    public static void calcultaor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.println("The weight in kg is: "+weight+" kg.");
        double gram = weight*10000;
        System.out.println("The weight in gram is: "+gram+" g.");
        double miligram = weight*1000000;
        System.out.println("The weight in miligram is: "+miligram+" mg.");
    }

}