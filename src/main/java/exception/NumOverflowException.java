package exception;

public class NumOverflowException extends RuntimeException {

    public NumOverflowException() {
        super();
    }

    public NumOverflowException(String message) {
        super(message);
    }

    public NumOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumOverflowException(Throwable cause) {
        super(cause);
    }

    protected NumOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
