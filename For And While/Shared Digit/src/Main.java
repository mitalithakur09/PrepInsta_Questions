// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(sharedDigit(22,23));
        System.out.println(sharedDigit(9,99));
        System.out.println(sharedDigit(15,52));
    }

    public static  boolean sharedDigit(int a, int b){
        boolean answer = false;
        int lefta = a/10;
        int righta = a%10;
        int leftb = b/10;
        int rightb = b%10;
        if(lefta == leftb || lefta == rightb || righta == rightb || righta == leftb){
            answer = true;

        }
        return answer;

    }

}