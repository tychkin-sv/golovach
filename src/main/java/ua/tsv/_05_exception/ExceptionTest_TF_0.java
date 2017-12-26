package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TF_0 {

    public static void main(String[] args) {
        // в finally заходим всегда. состояние летящего исключения приостанавливается

        System.out.println(f());
    }

    public static int f(){
        try {
            System.out.println(0);
            throw new RuntimeException();
        }
        finally {
            System.out.println(1);
        }
    }
}
