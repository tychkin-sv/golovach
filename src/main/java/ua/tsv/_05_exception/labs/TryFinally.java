package ua.tsv._05_exception.labs;

/**
 * Created by TSV on 18.12.2017.
 */
public class TryFinally {
        public static void main(String[] args) {

            try {
                main(args);
            }
            finally {
                main(args);
            }

        }
}
