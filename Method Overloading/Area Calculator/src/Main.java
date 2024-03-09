import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        int x = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int y = sc.nextInt();
        System.out.println("Enter the radius: ");
        double z = sc.nextDouble();
       getArea(x,y);
       getArea(z);

    }


    public static void getArea(float a, float b){
        if((a<0) || (b<0)){
            System.out.println(-1);
        }
        else{
            float rectangleArea = a * b;
            System.out.println(rectangleArea);
        }
    }

    public static void getArea(double c){
        if(c<0){
            System.out.println(-1);
        }
        else{
            double circleRadius = c*c*3.166;
            System.out.println(circleRadius);

        }
    }


}