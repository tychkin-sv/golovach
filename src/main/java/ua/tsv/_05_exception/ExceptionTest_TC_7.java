package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TC_7 {
    public static void main(String[] args) {
        // Не компилитруемый случай
        try {
            System.out.println(0);
            throw new NullPointerException();
        }
        catch (Exception e){
            System.out.println(1);
        }
        // Не компилируется, т.к. RuntimeException наследник Exception
        // а родитель уже обработан
        catch (Throwable/*RuntimeException*/ e){
            System.out.println(2);
        }

        System.out.println(3);
    }
}
