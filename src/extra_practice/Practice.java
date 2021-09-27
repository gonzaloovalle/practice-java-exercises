package extra_practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static int cubed(int num) {
        // cast to int
//        return (int) Math.pow(num, 3);
        return num * num * num;
    }

    public static int difference(int num1, int num2) {
        return num1 - num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double median(int[] myArray) {
        // sort array
        Arrays.sort(myArray);
        double median;
        // get count of integers
        int totalElements = myArray.length;
        // check if total number of integers is even
        if (totalElements % 2 == 0) {
            int sumOfMiddleElements = myArray[totalElements / 2] +
                    myArray[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) myArray[myArray.length / 2];
        }
        return median;

    }

    public static ArrayList<Cat> uppercaseCatColor(ArrayList<Cat> cats) {
        for(Cat cat: cats) {
            String color = cat.getColor();
            cat.setColor(color.toUpperCase());
        }
        return cats;
    }

}
