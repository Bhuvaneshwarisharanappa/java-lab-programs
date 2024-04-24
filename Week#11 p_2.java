import java.lang.*;
class NumberRangeException extends Exception {
    private String message;
    public NumberRangeException(String msg) {
        this.message = msg;
    }
    public String getMessage() {
        return message;
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 12, 13, 14, 16, 17, 15, 20, 21, 22, 23, 24, 20, 24, 27, 29, 30, 31, 32, 1};
        for (int number : numbers) {
            try {
                if (number < 10 || number > 20) {
                    throw new NumberRangeException("Number not within specified range.");
                }
                System.out.println("The number in range is: " + number);
            } catch (NumberRangeException nre) {
                System.out.println(nre.getMessage());
            }
        }
    }
}
