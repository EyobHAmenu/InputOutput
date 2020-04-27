import java.util.Scanner;

public class Ask {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        int num1, num2;
        double avg = 0;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextInt();
        System.out.print( "Second temperature? " );
        num2 = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println();

        avg = (num1 + num2) / 2;
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);

        System.out.println("The max value is : " + Math.max(num1, num2));
    }
}
