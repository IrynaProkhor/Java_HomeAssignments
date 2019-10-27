package Hometask_3_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word -> ");
        String input = sc.next();
        removeDuplicates(input);
    }
    public static void removeDuplicates(String input){
        String result = "";
        int index = 0;
        while (index < input.length()){
            if(!result.contains(String.valueOf(input.charAt(index)))) {
                result += String.valueOf(input.charAt(index));
            }
            index++;
        }
        System.out.println(result);
    }

}

