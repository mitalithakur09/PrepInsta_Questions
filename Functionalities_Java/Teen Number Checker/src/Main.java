import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Enter the third number");
        int c = sc.nextInt();
        boolean res = hasNotTeen(a,b,c);
        System.out.println(res);
    }
    public static boolean hasNotTeen(int a, int b, int c){
        if(a>=13 && a<=19 )
            return  false;

        else if(b>=13 && b<=19 )
            return  false;

        else if(c>=13 && c<=19 )
            return  false;

        else
            return true;

    }
}