import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(5,5));
//        System.out.println(Subtraction(5,5));
//        System.out.println(Multiplication(5,5));
//        System.out.println(Division(5,5));
//        System.out.println(Modulus(5,5));

        count(5);


    }

    public static int Addition(int x, int y) {
        return x + y;
    }

    public static int Subtraction(int x, int y) {
        return x - y;
    }

    public static int Multiplication(int x, int y) {
        return x * y;
    }

    public static int Division(int x, int y) {
        return x / y;
    }

    public static int Modulus(int x, int y) {
        return x % y;
    }

    //Recursion Example
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 1);
    }

    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            System.out.println("Not a number!");
            return getInteger(min, max);
        }
        int userInput = sc.nextInt();
        if (userInput >= min && userInput <= max) {
            return userInput;
        } else {
            System.out.println("Number not in range!");
            return getInteger(min, max);
        }
    }
}
