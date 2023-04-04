package exception;

public class NumberOverflowException extends RuntimeException {

    public NumberOverflowException() {
        super();
    }

    public NumberOverflowException(String message) {
        super(message);
    }

    public NumberOverflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberOverflowException(Throwable cause) {
        super(cause);
    }

    protected NumberOverflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
