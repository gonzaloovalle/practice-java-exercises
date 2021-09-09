public class MethodWarmup {

    public static void main(String[] args) {
//        System.out.println(getDifference(7, 5));
//        System.out.println(getDifference(5, 7));
//        System.out.println(10);
//        System.out.println(getDifference(1.5, 3));
//        System.out.println(getDifference(2.5, 1.5));
//        System.out.println(getDifference(8.2));
        System.out.println(addNums(5));
    }

    /*

        TODO: create a class, MethodWarmup, and add an empty main method.

        TODO: create a method, getDifference, that takes in two integers and returns the difference between the higher integer and the lower integer (subtract).
            - If both integers are equal, the order of operands doesn't matter in the calculation.
            - If only one integer is passed, treat the calculation as if zero was passed as the second argument.
            *** BONUS *** allow the method to accept two doubles and return a double output

    */

    public static int getDifference(int num1, int num2) {
        if (num1 > num2) return num1 - num2;
        return num2 - num1;
    }

    public static int getDifference(int num) {
        return getDifference(num, 0);
    }

    public static double getDifference(double num1, double num2) {
        if (num1 > num2) return num1 - num2;
        return num2 - num1;
    }
    public static double getDifference(double num) {
        return getDifference(num, 0);
    }

    // TODO: use recursion to add all numbers up, from 1 to the given number input
    /*
        addNums(5) would trigger a calculation of...
            5 + 4 + 3 + 3 + 1, evaluating to 15
     */
     public static int addNums(int num) {
         if (num <= 1){
             return num;
         }
         return addNums(num - 1) + num;
     }

}
