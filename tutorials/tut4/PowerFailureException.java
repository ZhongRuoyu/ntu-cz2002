package tutorials.tut4;

public class PowerFailureException extends Exception {
    private static final String DEFAULT_MESSAGE = "Power Failure!";

    public PowerFailureException() {
        this(DEFAULT_MESSAGE);
    }

    public PowerFailureException(String message) {
        super(message);
    }
    
    public static void main(String[] args) throws PowerFailureException {
        throw new PowerFailureException();
    }
}
