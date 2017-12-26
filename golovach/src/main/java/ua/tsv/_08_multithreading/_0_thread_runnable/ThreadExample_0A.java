package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by TSV on 25.12.2017.
 */
public class ThreadExample_0A {
    public static void main(String[] args) throws InterruptedException {
        for (int k = 0; k < 10; k++) {
            Thread.sleep(250);
            System.out.println("ThreadExample_0A k = " + k);
        }
    }
}
