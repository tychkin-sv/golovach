package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TCF_10B {
    public static void main(String[] args) {
        //
        try {
            System.out.println(0);
            if (true) {
                throw new NullPointerException();
            }
        } catch (NullPointerException e) {
            System.out.println(1);

        } finally {
            System.out.println(5);
            if (true) {
            throw new IllegalArgumentException();
            }
        }
        System.out.println(6);
    }
}
