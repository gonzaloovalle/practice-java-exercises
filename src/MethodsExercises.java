public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(Addition(5,5));
        System.out.println(Subtraction(5,5));
        System.out.println(Multiplication(5,5));
        System.out.println(Division(5,5));
        System.out.println(Modulus(5,5));
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
}
