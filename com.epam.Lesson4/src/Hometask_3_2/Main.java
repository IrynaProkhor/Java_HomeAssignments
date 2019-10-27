package Hometask_3_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number -> ");
            String n = sc.next();
            int num = Integer.parseInt(n);
            toBinaryString(num);
            System.out.println("Binary equivalent of " + num + " = "+ toBinaryString(num));

    }
        public static String toBinaryString(int num){
            String s = "";
            while (num > 0) {
                s = ((num % 2) == 0 ? "0" : "1") + s;
                num = num / 2;
            }
            return s;

        }
}
