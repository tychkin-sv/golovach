package ua.tsv._08_multithreading._0_thread_runnable;

/**
 * Created by TSV on 25.12.2017.
 */
public class PrintRunnable implements Runnable {
    private String msg;
    private int sleepMillis;

    public PrintRunnable(String msg, int sleepMillis) {
        this.msg = msg;
        this.sleepMillis = sleepMillis;
    }

    public void run() {
        for (int k = 0; k < 10; k++) {

            try {
                Thread.sleep(sleepMillis);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
            System.out.println(msg);
        }
    }
}
