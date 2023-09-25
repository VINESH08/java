package bankexceptions;

public class InvalidAmountException extends Exception {
    public InvalidAmountException() {
        super();
    }

    public InvalidAmountException(String str) {
        super(str);
    }
}
