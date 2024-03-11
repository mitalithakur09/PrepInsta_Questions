import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("Enter the first number: ");
        int b = sc.nextInt();
        System.out.println("Enter the second number: ");
        int c = sc.nextInt();
        System.out.println(isEven(a));
        System.out.println(evenSum(b,c));
    }
    public static boolean isEven(int e){
        if(e%2==0 && e>0){
            return true;
        }
        return false;
    }

    public static boolean evenSum(int a, int b){
        int sum = 0;
        for(int i = a; a<=b; a++){
            if(a%2==0){
                sum = sum+a;
               System.out.println(sum);
            }
        }
        if(a == b){
            return false;
        }
        else if (a<0 || b<0) {
            return false;
        }
        return true;
    }

}