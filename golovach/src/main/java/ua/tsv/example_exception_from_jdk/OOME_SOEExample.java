package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 19.12.2017.
 */
public class OOME_SOEExample {
    public static final int SIZE = 1024*1024;
    public static void main(String[] args) {

            f(new Object[]{new Object[SIZE]});
    }

    public static void f(Object[] tail){

        f(new Object[]{tail, new Object[SIZE]});
    }


}
