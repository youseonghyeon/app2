package exception;

public class NumberUnderflowException extends RuntimeException {

    public NumberUnderflowException() {
        super();
    }

    public NumberUnderflowException(String message) {
        super(message);
    }

    public NumberUnderflowException(String message, Throwable cause) {
        super(message, cause);
    }

    public NumberUnderflowException(Throwable cause) {
        super(cause);
    }

    protected NumberUnderflowException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
