import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        String year = sc.next();
        System.out.println("Enter the month: ");
        int month = sc.nextInt();
        switch (month){
            case 1:
                System.out.println("The Jan month has 31 days in "+year);
                break;
            case 2:
                System.out.println("The Feb month has 29 days in "+year);
                break;
            case 3:
                System.out.println("The March month has 31 days in "+year);
                break;
            case 4:
                System.out.println("The April month has 30 days in "+year);
                break;
            case 5:
                System.out.println("The May month has 31 days in "+year);
                break;
            case 6:
                System.out.println("The June month has 30 days in "+year);
                break;
            case 7:
                System.out.println("The July month has 31 days in "+year);
                break;
            case 8:
                System.out.println("The August month has 31 days in "+year);
                break;
            case 9:
                System.out.println("The Sept month has 30 days in "+year);
                break;
            case 10:
                System.out.println("The Oct month has 31 days in "+year);
                break;
            case 11:
                System.out.println("The Nov month has 30 days in "+year);
                break;
            case 12:
                System.out.println("The Dec month has 31 days in "+year);
                break;
            default:
                System.out.println("invalid month");
                break;



        }
    }
}