package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TC_9 {

    public static void main(String[] args) {
        // Можно перебросить исключение выше
        try {
            System.out.println(0);
            throw new NullPointerException();
        }
        catch (NullPointerException e){
            System.out.println(1);
            throw e;
        }
        catch (ArithmeticException e){
            System.out.println(2);
        }

        System.out.println(3);
    }

}
