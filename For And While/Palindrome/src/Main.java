import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        int rev = 0;
        int org = num;

        while (num != 0){
            int rem = num%10;
            rev = rev *10 + rem;
            num = num/10;
        }

        if(rev == org){
            System.out.println("The numebr is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
}
}