import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f \n", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("You entered: " + number );
    }


}
