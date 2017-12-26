package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 19.12.2017.
 */
public class OutOfMemoryErrorExapmle {
    public static final int SIZE = 1024*1024;

    public static void main(String[] args) {

        Object[] tail = null;
        while (true){
            tail = new Object[]{tail, new Object[SIZE]};
        }
    }
}
