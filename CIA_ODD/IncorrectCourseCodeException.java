package userexceptions;

public class IncorrectCourseCodeException extends Exception {
    public IncorrectCourseCodeException() {
        super();
    }

    public IncorrectCourseCodeException(String str) {
        super(str);
    }
}
