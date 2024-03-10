import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet: ");
        char s = sc.next().charAt(0);
        isVowel(s);

    }

    public static void isVowel(char alphabet) {
        switch (alphabet) {
            case 'a':
                System.out.println("a is vowel");
                break;
            case 'e':
                System.out.println("e is vowel");
                break;
            case 'i':
                System.out.println("i is vowel");
                break;
            case 'o':
                System.out.println("o is vowel");
                break;
            case 'u':
                System.out.println("u is vowel");
                break;
            default:
                System.out.println("The alphabet is consonant");
                break;
        }
    }

}