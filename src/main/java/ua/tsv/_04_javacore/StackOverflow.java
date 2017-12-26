package ua.tsv._04_javacore;

/**
 * Created by TSV on 15.12.2017.
 */
public class StackOverflow {
    public static int counter = 0;
    public static void fEmpty(){
        counter++;
        System.out.println(counter);
        fEmpty();
    }

    public static void main(String[] args) {
        fEmpty();
        System.out.println(counter);
    }

}
