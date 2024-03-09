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
        equalityPrinter(m,n,o);
    }
    public  static  int equalityPrinter(int a, int b, int c){
       if((a<0) || (b<0) || (c<0)){
          System.out.println("The value is invalid");
       }
       else if ((a==b) && (b==c) && (c==a)){
           System.out.println("The values are equals");
       }
       else{
           System.out.println("The values are not equal");
       }
       return 0;
    }
}