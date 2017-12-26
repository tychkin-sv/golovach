package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TF_4 {
    public static void main(String[] args) {
        // в finally заходим всегда. исключения перебивает !!! return

        System.out.println(f());
    }

    public static int f(){
        try {
            System.out.println(0);
            return 24;
        }
        finally {
            System.out.println(1);
            throw new RuntimeException();
        }
    }
}
