// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    greatestCommonDivisor(60,75);
    }
    public  static void greatestCommonDivisor(int a , int b) {
        for(int i =1; (i<=a) && (i<=b); i++){
            if((a%i==0)&&(b%i==0)){
                System.out.println(i);
            }
        }
    }

}