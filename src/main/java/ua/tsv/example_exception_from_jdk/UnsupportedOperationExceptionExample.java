package ua.tsv.example_exception_from_jdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by TSV on 21.12.2017.
 */
public class UnsupportedOperationExceptionExample {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(new ArrayList<String>());
        list.add("Hello");
    }
}
