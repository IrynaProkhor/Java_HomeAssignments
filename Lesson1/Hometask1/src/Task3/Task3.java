package Task3;

public class Task3 {

    public static void main(String[] args) {

        int deposit = 10_000;
        int months = 6;
        int rate = 12;
        int revenue = deposit * rate / 12 * months;

        System.out.print("Revenue = " + revenue);

    }
}
