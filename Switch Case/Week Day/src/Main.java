// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String dayWeek = "Tuesday";
       switch (dayWeek){
           case "Sunday":
               System.out.println("Today is Sunday");
               break;
           case "Monday":
               System.out.println("Today is Monday");
               break;
           case "Tuesday":
               System.out.println("Today is Tuesday");
               break;
           default:
               System.out.println("Today is Unknown Day");
               break;
       }
    }
}