package Hometask_4_2;

import java.util.Random;

public class Hometask4_2 {

    public static void main(String[] args) {
        int size = 10;
        int[] arr1 = createMatrix(size);
        int[] arr2 = createMatrix(size);
        System.out.println("First Array => ");
        printMatrix(arr1);
        System.out.println("Second Array => ");
        printMatrix(arr2);
        int[] arrSum = createMatrix(size);
        sumMatrix(arr1, arr2, arrSum);
        System.out.println("New Array => ");
        printMatrix(arrSum);
    }

    public static int[] createMatrix(int size) {
        Random random = new Random();
        int[] matrix = new int[size];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = random.nextInt(100);
        }
        return matrix;
    }

    public static int[] printMatrix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return arr;
    }
    public static int[] sumMatrix(int[] arr1, int[] arr2, int[] arrSum){
        for (int i = 0; i < arr1.length; i++) {
            arrSum[i] = arr1[i] + arr2[i];
        }
        return arrSum;
    }
}



