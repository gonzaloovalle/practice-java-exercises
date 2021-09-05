import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        int j = 100;
        long k = 2;


//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
//
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j > 0);
//
//        do {
//            System.out.println(k);
//            k *= k;
//        } while (k < 1000000);

        for (i = 5; i <= 15; i++) {
            System.out.println(i);
        }

        for (j = 100; j > 0; j-=5) {
            System.out.println(j);
        }

        for (k = 2; k < 1000000; k*=k) {
            System.out.println(k);
        }

        for (int l = 1; l <= 100; l++) {
            if (l % 15 == 0){
                System.out.println("FizzBuzz");
            } else if (l % 3 == 0) {
                System.out.println("Fizz");
            } else if (l % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(l);
            }
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Here is your table!");
        System.out.println("");

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        System.out.println(number + "      | " + (number * number) + "      | " + (number * number * number));

        System.out.println("Give me a grade between 0 - 100: ");
        int grade = sc.nextInt();
        sc.nextLine();

        System.out.println("Here is your grade: ");
    }

}
