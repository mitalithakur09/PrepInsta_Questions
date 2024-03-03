import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of Student: ");
        String a = sc.next();
        System.out.println("Enter the score of Student: ");
        int x = sc.nextInt();
        if(x>=90){
            System.out.println("The grade of student is A+");
        }
        else if(x>=80){
            System.out.println("The grade of student is A");
        }
        else if( x>=70){
            System.out.println("The grade of student is B+");
        }
        else if( x>=60){
            System.out.println("The grade of student is B");
        }
        else if( x>=50){
            System.out.println("The grade of student is C");
        }
        else{
            System.out.println("The grade of student is D");
        }

        System.out.println("The name of student is "+a+" and score is "+x);
    }
}