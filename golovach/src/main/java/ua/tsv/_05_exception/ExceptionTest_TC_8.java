package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TC_8 {
    public static void main(String[] args) {
       // Из одного catch не попадешь в другой
        try {
            System.out.println(0);
            throw new NullPointerException();
        }
        catch (NullPointerException e){
            System.out.println(1);
            throw new ArithmeticException();  // Просто вікинет исключение
        }
        catch (ArithmeticException e){
            System.out.println(2);
        }

        System.out.println(3);
    }
}
