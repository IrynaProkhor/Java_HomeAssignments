package Example1;

public class Example1 {
    public static void main(String[] args) {

        int line = 1;
        while (line <= 8) {
            int digit = line;
            while (digit > 0) {
                System.out.print(digit);
                digit --;
            }
             System.out.println();
             line ++;
        }


    }
}
