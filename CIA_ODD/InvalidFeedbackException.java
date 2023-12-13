package userexceptions;

public class InvalidFeedbackException extends Exception {
    public InvalidFeedbackException() {
        super();
    }

    public InvalidFeedbackException(String str) {
        super(str);
    }
}
