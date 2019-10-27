package Hometask_4_1;

import java.util.Arrays;
import java.util.Scanner;

public class Hometask4_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size array => ");
        int size = scan.nextInt();
        int[] array = createArray(size);
        System.out.println(Arrays.toString(array));
        reverse(array);

    }
    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 50) - 25);
        }
        return array;
    }

    public static void reverse(int[] array) {
        int i = 0;
        int[] revArray = new int[array.length];
        while (i < array.length) {
            revArray[i] = array[array.length - 1 - i];
            i++;
        }
        System.out.println("The reversed Array => " + Arrays.toString(revArray));
    }

}

