package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TC_6 {
    public static void main(String[] args) {
        // Из одного catch не попадешь в другой
        try {
            System.out.println(0);
            throw new NullPointerException();
        }
        catch (ArithmeticException e){
            System.out.println(1);
            throw new ArithmeticException();
        }
        catch (RuntimeException e){
            System.out.println(2); // Выведет, т.к. NullPointerException явл наследником RuntimeException
        }
        catch (Exception e){
            System.out.println(3);
        }

        System.out.println(4);
    }
}
