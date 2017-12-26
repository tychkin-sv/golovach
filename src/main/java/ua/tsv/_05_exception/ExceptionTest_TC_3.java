package ua.tsv._05_exception;

/**
 * Created by TSV on 18.12.2017.
 */
public class ExceptionTest_TC_3 {
    public static void main(String[] args) {
        try {
            System.out.println(0);
            throw new RuntimeException();
        }
        catch (NullPointerException e){
            System.out.println(1);
        }
        catch (Exception e){
            System.out.println(2);
        }
        catch (Error e) {
            System.out.println(3);
        }
        System.out.println(4);
    }
}
