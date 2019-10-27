package Hometask_4_3;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask4_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size array => ");
        int size = scan.nextInt();
        int[] array = createArray(size);
        System.out.println(Arrays.toString(array));
        divide(array);
    }
    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10) - 5);
        }
        return array;
    }

    public static void divide(int[] array) {
        int positive = 0;
        int negative = 0;
        for (int elem : array) {
            if (elem > 0) positive++;
            else if (elem < 0) negative++;
        }
        int[] allPositive = new int[positive];
        int[] allNegative = new int[negative];
        positive = 0;
        negative = 0;

        for (int elem : array) {
            if (elem > 0) allPositive[positive++] = elem;
            else if (elem < 0) allNegative[negative++] = elem;
        }

        System.out.println("Positive: " + Arrays.toString(allPositive));
        System.out.println("Negative: " + Arrays.toString(allNegative));
    }

}
