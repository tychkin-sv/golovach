package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TCF_1B {
    public static void main(String[] args) {
        //
        try {
            System.out.println(0);
            if (true){
                throw new NullPointerException();
            }
        }
        catch (RuntimeException e){
            System.out.println(1);
        }
        finally {
            System.out.println(5);
        }
        System.out.println(6);
    }
}
