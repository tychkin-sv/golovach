package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by TSV on 25.12.2017.
 */
public class ThreadExample_ {
    public static void main(String[] args) {
        for (int k = 0; k < 10; k++) {

            Thread thread = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 1000000000L; i++) {
                    }
                    System.out.println("ThreadExample_0 k =" + Thread.currentThread().getName());
                }
            }, "" + k);
            thread.start();


        }
    }

}
