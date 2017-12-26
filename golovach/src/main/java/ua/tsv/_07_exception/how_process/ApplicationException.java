package ua.tsv._07_exception.how_process;

/**
 * Created by TSV on 24.12.2017.
 */
public class ApplicationException extends Exception {
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
