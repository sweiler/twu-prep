public class InputValidation {

    public static void checkInputArgumentIsPositive(int inputArg) throws IllegalArgumentException {
        if (inputArg <= 0) {
            throw new IllegalArgumentException("Invalid Argument. Please provide postive Integer as argument!");
        }
    }
}
