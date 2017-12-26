package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TCF_10A {
    public static void main(String[] args) {
        //
        try {
            System.out.println(0);
            if (true) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println(1);
            throw new IllegalArgumentException();
        } finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}