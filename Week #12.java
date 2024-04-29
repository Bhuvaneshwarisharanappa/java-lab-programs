enum Signal {
    RED, YELLOW, GREEN
}
class CheckSignal {
    Signal currentSignal;
    public CheckSignal(Signal currentSignal) {
        this.currentSignal = currentSignal;
    }
    public void makeDecision() {
        switch (currentSignal) {
            case RED:
                System.out.println("The signal is red. Please wait until it turns green.");
                break;
            case YELLOW:
                System.out.println("The signal is yellow. Proceed with caution.");
                break;
            case GREEN:
                System.out.println("The signal is green. You may proceed.");
                break;
            default:
                System.out.println("Invalid signal.");
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        CheckSignal myDrive = new CheckSignal(Signal.GREEN);
        myDrive.makeDecision();
    }
}
