package Task2;

public class Task2 {

    public static void main(String[] args) {

        int value1 = 5;
        double value2 = 0.4536;
        double result = value2 * (double)value1;
        int weight1 = (int)result;
        double weight2 = result - (double)weight1;

        System.out.print("Вес = " + weight1 + " кг" + " и " + weight2 + " г");



    }
}
