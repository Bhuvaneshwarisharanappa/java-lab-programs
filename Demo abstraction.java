abstract class MyCalculator {
    abstract void performArithmetic(int operand1, int operand2);
}

class PerformAddition extends MyCalculator {
    void performArithmetic(int num1, int num2) {
        System.out.println("The sum of two numbers is: " + (num1 + num2));
    }
}

class PerformSubtraction extends MyCalculator {
    void performArithmetic(int num1, int num2) {
        System.out.println("The difference of two numbers is: " + (num1 - num2));
    }
}

class PerformMultiplication extends MyCalculator {
    void performArithmetic(int num1, int num2) {
        System.out.println("The product of two numbers is: " + (num1 * num2));
    }
}

class PerformDivision extends MyCalculator {
    void performArithmetic(int num1, int num2) {
        System.out.println("The remainder after division is: " + (num1 % num2));
    }
}

public class DemoAbstraction {
    public static void main(String[] args) {
        PerformAddition sum = new PerformAddition();
        sum.performArithmetic(20, 30);

        PerformSubtraction diff = new PerformSubtraction();
        diff.performArithmetic(120, 30);

        PerformMultiplication product = new PerformMultiplication();
        product.performArithmetic(12, 33);

        PerformDivision rem = new PerformDivision();
        rem.performArithmetic(1213, 33);
    }
}
