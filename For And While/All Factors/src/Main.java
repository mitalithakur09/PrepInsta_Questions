import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int b = sc.nextInt();
    allFactors(b);
    }
    public static void allFactors(int a){

        for(int i = 1; i<=a; i++){
            if(a%i==0){
               System.out.println(i);
            }
        }

    }

}