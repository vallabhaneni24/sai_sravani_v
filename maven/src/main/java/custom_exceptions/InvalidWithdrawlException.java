package custom_exceptions;

public class InvalidWithdrawlException extends Exception {
    public InvalidWithdrawlException(String message) {
        super(message);
    }
}