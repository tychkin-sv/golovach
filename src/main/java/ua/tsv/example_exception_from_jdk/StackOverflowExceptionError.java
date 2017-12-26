package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 19.12.2017.
 */
public class StackOverflowExceptionError {

    public static void main(String[] args) {
        f();
    }

    public static void f(){
        f();
    }
}
