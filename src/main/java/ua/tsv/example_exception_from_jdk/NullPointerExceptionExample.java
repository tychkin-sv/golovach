package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 20.12.2017.
 */
public class NullPointerExceptionExample {
    public static void main(String[] args) {
        Object ref = null;
        ref.toString();
    }
}
