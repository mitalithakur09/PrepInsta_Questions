public class Main
{
    public static int sumFirstAndLastDigit (int num)
    {
        if (num < 0)
            return -1;
        int first = 0, last = num % 10;
        num = num / 10;

        while (num != 0)
        {
            if (num / 10 == 0)
                first = num % 10;
            num = num / 10;
        }
        return first + last;
    }

    public static void main (String[]args)
    {
        System.out.println (sumFirstAndLastDigit (352));
        System.out.println (sumFirstAndLastDigit (1));
        System.out.println (sumFirstAndLastDigit (-7));
    }
}