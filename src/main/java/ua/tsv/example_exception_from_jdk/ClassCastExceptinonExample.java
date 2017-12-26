package ua.tsv.example_exception_from_jdk;

/**
 * Created by TSV on 20.12.2017.
 */
public class ClassCastExceptinonExample {
    public static void main(String[] args) {
        int[] x = (int[]) ((Object)(new float[10]));

    }
}
