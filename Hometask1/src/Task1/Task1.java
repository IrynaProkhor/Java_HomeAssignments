package Task1;

public class Task1 {

    public static void main(String[] args) {

        int value1 = 123;
        int value2 = 0;

        value2 = value1 % 10;
        value1 = value1 / 10;
        value2 = value2 * 10 + value1 % 10;
        value1 = value1 / 10;
        value2 = value2 * 10 + value1;
        value1 = 123;
        int result = value1 - value2;

        System.out.println("sub = " + (value1 - value2));

    }


}
